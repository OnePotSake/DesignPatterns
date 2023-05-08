package creational.patterns.strategy.demo;

import java.util.Arrays;

/**
 * @description: 策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改.
 * @author: OnePotSake
 * @createTime: 2020.08.21
 */
public class Demo {
  public static void main(String[] args) {
/*    Cat t = new Cat(7, "tom");
    Cat j = new Cat(3, "jim");
    Cat c = new Cat(6, "c");
    Cat d = new Cat(5, "d");
    Cat[] cats = { t, j, c, d};
    Sorter.sort(cats);
    Arrays.asList(cats).forEach(System.out::println);*/

    Dog t = new Dog(7,"tom", 3);
    Dog j = new Dog(3, "j", 76);
    Dog c = new Dog(6, "c", 35);
    Dog d = new Dog(5, "d", 67);
    Dog[] dogs = { t, j, c, d};
   Sorter<Dog> sorter = new Sorter<>();
    sorter.sortObjectElment(dogs,  new DogCompartor());
    Arrays.asList(dogs).forEach(System.out::println);
    System.out.println("-0----------------");
    sorter.sortObjectElment(dogs,  new DogHitCompartor());
    Arrays.asList(dogs).forEach(System.out::println);
    System.out.println("-0----------------");
    // 函数式接口,可以用这种方式
    sorter.sortObjectElment(dogs, (o1, o2)->{
      if(o1.age < o2.age) {
        return -1;
      } else if (o1.age>o2.age) {
        return 1;
      } else {
        return 0;
      }
    });
    Arrays.asList(dogs).forEach(System.out::println);



  }



}
