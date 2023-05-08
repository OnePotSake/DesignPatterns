package creational.patterns.singleton.lazy;

/**
 * 懒汉式
 */
public class SingletonLazyDemo {


    // 私有化构造方法  双端校验
    private SingletonLazyDemo() {
    }


    // 每次创建的都是新
  private volatile static SingletonLazyDemo sigletonHurtyDemo = new SingletonLazyDemo();


    // 提供外部访问的公共方法
    public static SingletonLazyDemo getSingletonHungryDemo() {

        if(sigletonHurtyDemo == null) {

            synchronized (SingletonLazyDemo.class) {

                if(sigletonHurtyDemo == null) {

                sigletonHurtyDemo = new SingletonLazyDemo();
                }
            }

        }
        return   sigletonHurtyDemo;


    }

}









