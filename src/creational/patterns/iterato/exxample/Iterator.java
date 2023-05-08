package creational.patterns.iterato.exxample;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/5/23 00:23:48
 */
public interface Iterator<E> {

  // 判断集合是否有下一个元素
  boolean hashNext();


  // 返回当前又标制定的元素
  void next();

   // 返回当前游标指定的元素
    E currentItem();

}
