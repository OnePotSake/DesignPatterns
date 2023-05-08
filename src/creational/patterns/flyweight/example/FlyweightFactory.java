package creational.patterns.flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 *
   享元工厂类
 *      作用: 作为存储享元对象的享元池.用户获取享元对象时先从享元池中获取,有则返回,没有创建新的返回给用户,
 *      并且在享元池中保存

 * @date 5/3/23 13:35:11
 */
public class FlyweightFactory {

  // 定义一个Map 集合 用于存储享元对象,实现享元池
  private Map<String, Flyweight> pool = new HashMap<>();


  // 实现享元对象的状态传递
  public FlyweightFactory () {
    pool.put("A", new ConcreteFlyweight(("A")));
    pool.put("B", new ConcreteFlyweight(("B")));
    pool.put("C", new ConcreteFlyweight(("C")));
  }


  // 根据内部状态进行查找
  public Flyweight getFlyweight (String key) {


    // 对象是否存在
    if(pool.containsKey(key)) {

      System.out.println("---- 享元池中存在, 连接key 进行复用 key : "   +  key);
     return pool.get(key);
    }

    // 如果不存在,就创建一个添加到享元池中,创建并复用key,然后返回
    System.out.println("不存在这个key, 进行创建新的key ,key 为: " + key);
    Flyweight f = new ConcreteFlyweight(key);
    pool.put(key, f);
    return f;
  }

}
