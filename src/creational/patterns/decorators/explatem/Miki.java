package creational.patterns.decorators.explatem;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 甜品
 * @date 5/1/23 22:42:34
 */
public class Miki  extends Decorator{
  public Miki(Drink drink) {
    super(drink);
    setName("牛奶");
    setPrice(5);
  }
}
