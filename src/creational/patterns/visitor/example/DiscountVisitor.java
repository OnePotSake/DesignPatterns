package creational.patterns.visitor.example;

import java.text.NumberFormat;
import java.time.LocalDate;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 具体访问接口  折扣计价 访问接口
 * @date 5/5/23 03:40:02
 */
public class DiscountVisitor implements Visitor{

  private LocalDate billDate;

  public DiscountVisitor(LocalDate billDate) {
    this.billDate = billDate;
    System.out.println("结算日期为: " + billDate);
  }

  @Override
  public void visit(Candy candy) {
    System.out.println("糖果名称: " + candy.getName());
    // 糖果大于180天,禁止收买,否则一律9折
    long days = billDate.toEpochDay() - candy.getProductDate().toEpochDay();
    if(days > 180) {
      System.out.println("超过半年的糖果禁止出售");
      return;
    }

    double rePrice = candy.getPrice() * 0.9f;
    System.out.println("逃过价格打折后为: :" + NumberFormat.getCurrencyInstance().format(rePrice));

  }

  @Override
  public void visit(Wine wine) {
    System.out.println("酒水类: " );
    System.out.println("原价销售,不进行打折: ");
    double price = wine.getPrice();
    NumberFormat.getCurrencyInstance().format(price);
  }

  @Override
  public void visit(Fruit fruit) {
    System.out.println("水果类");

    double rate = 0;
    long days = billDate.toEpochDay()-fruit.getProductDate().toEpochDay();
    if( days> 7) {
      System.out.println("超过7天无法售售卖 !!!!");
      return;
    } else if(days > 3)  {
      System.out.println("水果5折售卖! ");
       rate = 0.5;
    } else {
      rate =1;
    }

    double rePrice = fruit.getPrice() * fruit.getWeight() * rate;
    // 默认保留3位小树
    System.out.println("价格为: " + NumberFormat.getCurrencyInstance().format(rePrice));

  }

  public LocalDate getBillDate() {
    return billDate;
  }

  public void setBillDate(LocalDate billDate) {
    this.billDate = billDate;
  }
}
