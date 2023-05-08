package creational.patterns.visitor.example;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/5/23 04:19:27
 */
public class Client {
  public static void main(String[] args) {
/*    Candy candy = new Candy("金丝猴",   LocalDate.of(2023, 2, 10), 5.5f);



    DiscountVisitor discountVisitor = new DiscountVisitor(LocalDate.of(2023, 5, 4));
    discountVisitor.visit(candy);*/

/*    //将3件商品加入购物车
        List<Product> products = Arrays.asList(
               new Candy("金丝猴奶糖",LocalDate.of(2022,10,1),10),
              new Wine("郎酒",LocalDate.of(2022,10,1),1000),
                new Fruit("草莓",LocalDate.of(2022,10,8),50,1)
               );

      Visitor visitor = new DiscountVisitor(LocalDate.of(2022,10,5));
        for (Product product : products) {
           //visitor.visit();
        }*/

    //模拟添加多个商品
    List<Accetale> list = Arrays.asList(
        new Candy("金丝猴奶糖",LocalDate.of(2022,10,1),10),
        new Wine("郎酒",LocalDate.of(2022,10,1),1000),
        new Fruit("草莓",LocalDate.of(2022,10,8),50,1)
    );

    Visitor visitor = new DiscountVisitor(LocalDate.of(2022,10,11));
    for (Accetale product : list) {
      product.accept(visitor);
    }



  }
}
