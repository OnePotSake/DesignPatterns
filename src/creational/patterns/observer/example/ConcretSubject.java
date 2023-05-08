package creational.patterns.observer.example;

import java.util.ArrayList;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 抽象观察方法 被观察对象行为 具体实现
 * @date 5/3/23 15:46:18
 */
public class ConcretSubject implements Subject {


  //定义集合,存储所有的观察者对象
  private ArrayList<Observer> observers = new ArrayList<>();


  //注册方法,向观察者集合增加一个观察者
  @Override
  public void attach(Observer observer) {
    observers.add(observer);
  }

  //注销方法,用于从观察者集合中移除一个观察者
  @Override
  public void detach(Observer observer) {
    observers.remove(observer);
  }

  //通知方法
  @Override
  public void notifyObservers() {
    //遍历集合,调用每一个观察者的响应方法
    for (Observer observer : observers) {
      observer.update();
    }
  }



}
