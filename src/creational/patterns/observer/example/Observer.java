package creational.patterns.observer.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 行为模式-观察者模式  定义观察者 行为
 *
 * 抽象观察者 - 为观察者提供公共方法
 * @date 5/3/23 15:39:08
 */
public interface Observer {

  //update方法: 为不同的观察者更新行为定义一个相同的接口,不同的观察者对该接口有不同的实现
  public void update();

}
