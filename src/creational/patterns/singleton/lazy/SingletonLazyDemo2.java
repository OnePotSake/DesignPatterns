package creational.patterns.singleton.lazy;

/**
 *饿汉式
 */
public class SingletonLazyDemo2 {

    // 私有化构造方法  双端校验
    private SingletonLazyDemo2() {
        // 不添加以下内容则会出现反射生成对象地址不同
        if(SingletondDemo.singletondDeom !=null) {
          throw new RuntimeException("反射已经创建了对象,不允许再次创建对象");
        }
    }

    public static class SingletondDemo {
        private static SingletonLazyDemo2 singletondDeom = new SingletonLazyDemo2() ;
    }



    // 提供外部访问的公共方法
    public static SingletonLazyDemo2 getSingletonHungryDemo() {
        return  SingletondDemo.singletondDeom;
    }
}









