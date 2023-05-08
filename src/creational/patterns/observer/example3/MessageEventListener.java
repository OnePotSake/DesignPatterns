package creational.patterns.observer.example3;

import creational.patterns.observer.example2.LotteryResult;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 发短信监听
 * @date 5/3/23 16:31:17
 */
public class MessageEventListener implements EventListener{

  @Override
  public void doEvent(LotteryResult result) {
    System.out.println("记录用户的摇号结果(MQ),用户ID: " + result.getUId()
        + ",摇号结果: " + result.getMsg());
  }

}
