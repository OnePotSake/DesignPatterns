package creational.patterns.strategy.demo;


/**
 * @description:
 * @author: OnePotSake
 * @createTime: 2020.08.21
 */
public class Dog implements Comparable<Dog> {
 int age; String name; int hit;

  public Dog(int age, String name, int hit) {
    this.age = age;
    this.name = name;
    this.hit = hit;
  }

  public Dog(int age) {
    this.age = age;
  }

  @Override
  public int compareTo(Dog o) {
    if (this.age > o.age) {
      return  1;}
    else if(this.age == o.age) {
      return 0;}
    else {
      return -1;}
  }

  @Override
  public String toString() {
    return "Dog{" +
        "age=" + age +
        ", name='" + name + '\'' +
        ", hit=" + hit +
        '}';
  }
}
