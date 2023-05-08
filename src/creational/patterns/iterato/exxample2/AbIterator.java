package creational.patterns.iterato.exxample2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 抽象迭代器接口
 * @date 5/5/23 00:45:44
 */
public interface AbIterator<E> {

  // 重置为第一个元素
  void rnext();

  // 获取下一个元素
  E next();


  // 检索当前元素
  E currentItem();

  // 检索下个元素是否存在
  boolean hashNext();

}
