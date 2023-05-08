package creational.patterns.observer.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 抽象目标类 定义 被观察对象行为
 * @date 5/3/23 15:45:17
 */
public interface Subject {

  void attach(Observer observer);

  void detach(Observer observer);

  void notifyObservers();


}
