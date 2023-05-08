package creational.patterns.singleton.issue;

import creational.patterns.singleton.lazy.SingletonLazyDemo2;

import java.lang.reflect.Constructor;

/**
 * 问题
 * 反射单例危害,
 * 采用静态内部类情况下,若原有类中的构造没有判断对象是否已经生成则会出现对象地址不同问题,无法实现单例模式,
 */
public class ReflectionSingletonDemo {



    public static void main(String[] args) throws Exception {

    Class<SingletonLazyDemo2>  sig = SingletonLazyDemo2.class;
    Constructor<SingletonLazyDemo2> constructor = sig.getDeclaredConstructor();
    constructor.setAccessible(true);

    SingletonLazyDemo2 demo =  constructor.newInstance();
    SingletonLazyDemo2 demo2 = constructor.newInstance();

    // 如果不在构建对象时进行逻辑判断,根据反射机制生成的对象会出现地址不同,无法实现单例
    System.out.println(demo);
    System.out.println(demo2);


    System.out.println(demo2 == demo);

    }


}
