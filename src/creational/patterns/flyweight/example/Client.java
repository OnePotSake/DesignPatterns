package creational.patterns.flyweight.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 13:47:42
 */
public class Client {
  public static void main(String[] args) {
    System.out.println("享元测试.......");

    // 获取一个工厂对象
    FlyweightFactory flyweightFactory = new FlyweightFactory();

    //通过工厂获取享元对喜爱那个
    Flyweight a = flyweightFactory.getFlyweight("A");
    a.operation("我是A");


    Flyweight a2 = flyweightFactory.getFlyweight("A");


    a2.operation("我是A");
    System.out.println(a == a2);

    System.out.println("享元测试 非共享对象.......");
    // 获取非共享对象
    UnsharedFlyweight u = new UnsharedFlyweight("A");
    u.operation("A");
    UnsharedFlyweight u2 = new UnsharedFlyweight("A");
    u2.operation("A");

    System.out.println(u == u2);

  }
}
