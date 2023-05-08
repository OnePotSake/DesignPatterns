package creational.patterns.iterato.exxample2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 抽象集合
 * @date 5/5/23 03:13:19
 */
public interface AbList<E> {
  // 迭代器对象集合方法
  AbIterator<E> iterator();
}
