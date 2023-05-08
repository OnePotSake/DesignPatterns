package creational.patterns.observer.example3;

import creational.patterns.observer.example2.LotteryResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 事件处理类
 * @date 5/3/23 16:46:40
 */
public class EventManager {

  // 监听器集合
  public enum EventType {
    MQ,Message
  }

  // 监听器集合
  Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();

  public EventManager(Enum<EventType> ... operations) {
    for (Enum<EventType> operation : operations) {
      this.listeners.put( operation, new ArrayList<EventListener>());
    }

  }

  /**
   * 订阅
   eventtype 事件类型
   listener 监听类型
   */
  public void subscribe (Enum<EventType> eventtype, EventListener listener) {
    List<EventListener> users = listeners.get(eventtype);
    users.add(listener);
  }

  /**
   * 取消订阅
   * @param eventType 事件类型
   * @param listener  监听对象
   */
  public void unsubscribe(Enum<EventType> eventType,EventListener listener){
    List<EventListener> users = listeners.get(eventType);
    users.remove(listener);
  }


  /**
   * 通知
   * @param eventType
   * @param result
   */
  public void notify(Enum<EventType> eventType, LotteryResult result){
    List<EventListener> users = listeners.get(eventType);
    for (EventListener listener : users) {
      listener.doEvent(result);
    }
  }


}
