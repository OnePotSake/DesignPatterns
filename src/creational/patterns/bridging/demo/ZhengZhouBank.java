package creational.patterns.bridging.demo;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 当地银行
 * @date 5/1/23 19:22:28
 */
public class ZhengZhouBank extends Bank {

  public ZhengZhouBank(Ipay pay) {
    super(pay);
  }

  @Override
  protected void pay() {
    pay.pay();
    System.out.println("郑州 地方 小银行");
  }


}
