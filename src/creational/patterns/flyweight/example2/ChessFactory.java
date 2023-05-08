package creational.patterns.flyweight.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 14:04:33
 */
public class ChessFactory {
  //享元池
  private static Map<String,Chessman> pool;

  //创建共享享元对象,设置对象的内部状态
  private ChessFactory() {
    pool = new HashMap<>();
    Chessman black = new BlackChessman(); //黑子
    Chessman write = new WhiteChessman(); //白子

    pool.put("b",black);
    pool.put("w",write);
  }

  //静态内部类
  private static class SingletonHolder{
    private static final ChessFactory INSTANCE = new ChessFactory();
  }


  //获取唯一享元工厂对象的方法
  public static ChessFactory getInstance(){
    return SingletonHolder.INSTANCE;
  }



  //通过key获取集合中的享元对象
  public Chessman getChessman(String key){
    return pool.get(key);
  }

}
