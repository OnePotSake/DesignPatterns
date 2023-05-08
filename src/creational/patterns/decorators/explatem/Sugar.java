package creational.patterns.decorators.explatem;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 糖 甜品
 * @date 5/1/23 22:10:38
 */
public class Sugar  extends Decorator{

  public Sugar(Drink drink) {
    super(drink);
    setName("白糖");
    setPrice(4);
  }


}
