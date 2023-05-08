package creational.patterns.observer.example3;

import creational.patterns.observer.example2.LotteryResult;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 监听事件 接口
 * @date 5/3/23 16:19:07
 */
public interface EventListener {
  void doEvent(LotteryResult result);
}

