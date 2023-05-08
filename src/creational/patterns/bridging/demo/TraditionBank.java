package creational.patterns.bridging.demo;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 传统银行功能
 * @date 5/1/23 19:10:54
 */
public class TraditionBank implements Ipay{
  @Override
  public void getUserId() {
    System.out.println("传统获取用户id");
  }

  @Override
  public void getMoney() {
    System.out.println("传统获取余额");
  }

  @Override
  public void pay() {
    System.out.println("传统支付金钱");
  }
}
