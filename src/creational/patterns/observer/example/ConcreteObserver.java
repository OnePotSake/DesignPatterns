package creational.patterns.observer.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 15:43:54
 */
public class ConcreteObserver implements Observer{
  @Override
  public void update() {
    System.out.println("ConcreteObserver1 得到通知,更新状态! !");
  }
}
