package creational.patterns.singleton;

import creational.patterns.singleton.hungry.SingletonHungryDemo;

/**
 * @description: 单例模式
 * @author: OnePotSake
 * @createTime: 2020.08.21
 * 可以预预防反序列化,
 */
public enum SingletonDemo {
  INSTANCE;
  public static void main(String[] args) {
  /*  for (int i = 0; i < 10; i++) {
      new Thread(()-> System.out.println(SingletonDemo.INSTANCE.hashCode())).start();
    }*/



    // 测试 饿汉式
   for (int i = 0; i < 10; i++) {
      new Thread(()-> System.out.println(SingletonHungryDemo.getSingletonHungryDemo())).start();
    }


  }
}
