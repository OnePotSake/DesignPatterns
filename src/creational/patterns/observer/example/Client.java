package creational.patterns.observer.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 15:48:06
 */
public class Client {

  public static void main(String[] args) {

    //创建目标类
    Subject subject = new ConcretSubject();

    //注册观察者,注册多个
    subject.attach(new ConcreteObserver());
    subject.attach(new ConcreteObserver2());

    //具体的主题内部发生改变,给所有注册的观察者发送通知
    subject.notifyObservers();




  }
}
