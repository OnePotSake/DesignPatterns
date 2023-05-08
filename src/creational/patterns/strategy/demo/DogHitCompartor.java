package creational.patterns.strategy.demo;

/**
 * @description: 可以在此基础上进行多重不同风格的策略,进行比较.
 * @author: OnePotSake
 * @createTime: 2020.09.19
 */
public class DogHitCompartor implements Comparator<Dog>  {
  @Override
  public int compare(Dog o1, Dog o2) {
    if (o1.hit > o2.hit) {
      return  1;}
    else if(o1.hit == o2.hit) {
      return 0;}
    else {
      return -1;}
  }
}
