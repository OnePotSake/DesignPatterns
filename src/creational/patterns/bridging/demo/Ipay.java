package creational.patterns.bridging.demo;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 支付必要借口
 * @date 5/1/23 19:09:53
 */
public interface Ipay {

  void getUserId();
  void getMoney();

  void pay();

}
