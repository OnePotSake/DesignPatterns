package creational.patterns.strategy.demo;

/**
 * @description:
 * @author: OnePotSake
 * @createTime: 2020.09.19
 */
public interface Comparator<T> {
  int compare(T obj, T obj2);
 // int comparreToHit(T1 obj, T2 obj2);
  default void m(){
    System.out.println("加载~!");
 }
}
