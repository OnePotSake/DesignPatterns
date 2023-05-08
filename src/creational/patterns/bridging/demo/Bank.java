package creational.patterns.bridging.demo;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 银行卡
 * @date 5/1/23 19:12:28
 */
public abstract  class Bank {
  protected Ipay pay;

  public Bank(Ipay pay) {
    super();
    this.pay = pay;
  }
  // 支付方式

  // 银行功能
  protected abstract void pay();

}
