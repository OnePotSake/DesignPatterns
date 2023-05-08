package creational.patterns.observer.example3;

import creational.patterns.observer.example2.LotteryResult;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 开奖服务接口
 * @date 5/3/23 18:37:25
 */
public abstract class LotteryService {

  // 事件 管理器
  private EventManager eventManager;

  public LotteryService() {
    //设置事件的类型
    eventManager = new EventManager(EventManager.EventType.MQ,EventManager.EventType.Message);
    //订阅
    eventManager.subscribe(EventManager.EventType.Message,  new MessageEventListener());
    eventManager.subscribe(EventManager.EventType.MQ, new MQEventLister());
  }

  public LotteryResult lotteryAndMsg(String uId) {
    LotteryResult lottery = lottery(uId);

    // 发送通知
    eventManager.notify(EventManager.EventType.Message, lottery);
    eventManager.notify(EventManager.EventType.MQ, lottery);
    return null;

  }


  public abstract LotteryResult lottery(String uId);
}
