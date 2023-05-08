package creational.patterns.strategy.demo;
/**
 * @description:
 * @author: OnePotSake
 * @createTime: 2020.09.19
 */
public class DogCompartor implements Comparator<Dog>  {
  @Override
  public int compare(Dog o1, Dog o2) {
    if (o1.age > o2.age) {
      return  1;}
    else if(o1.age == o2.age) {
      return 0;}
    else {
      return -1;}
  }
}
