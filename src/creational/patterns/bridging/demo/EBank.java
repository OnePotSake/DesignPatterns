package creational.patterns.bridging.demo;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 网络银行
 * @date 5/1/23 19:10:54
 */
public class EBank implements Ipay{
  @Override
  public void getUserId() {
    System.out.println("网络获取用户id");
  }

  @Override
  public void getMoney() {
    System.out.println("网络获取余额");
  }

  @Override
  public void pay() {
    System.out.println("网络支付金钱");
  }
}
