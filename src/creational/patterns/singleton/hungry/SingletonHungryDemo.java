package creational.patterns.singleton.hungry;

/**
 *饿汉式
 */
public class SingletonHungryDemo {


    // 私有化构造方法
    private SingletonHungryDemo() {
    }


    // 每次创建的都是新
  private static  SingletonHungryDemo sigletonHurtyDemo = new SingletonHungryDemo();


    // 提供外部访问的公共方法
    public static SingletonHungryDemo  getSingletonHungryDemo() {
        return  sigletonHurtyDemo;
    }

}









