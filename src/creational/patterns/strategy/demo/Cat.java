package creational.patterns.strategy.demo;

/**
 * @description:
 * @author: OnePotSake
 * @createTime: 2020.08.21
 */
public class Cat implements Comparable<Cat>{
 int age; String name;

  @Override
  public int compareTo(Cat o) {
    if (this.age > o.age) {
      return  1;}
    else if(this.age == o.age) {
      return 0;}
    else {
      return -1;}
  }

  @Override
  public String toString() {
    return "Cat{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }

  public Cat(int age, String name) {
    this.age = age;
    this.name = name;
  }
}
