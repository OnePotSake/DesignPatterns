package creational.patterns.decorators.explatem;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 组合
 * @date 5/1/23 22:22:05
 */
public class Decorator extends Drink {

  private Drink drink;

  // 组合
  public Decorator(Drink drink) {
    this.drink = drink;
  }

  @Override
  int cost() {
    return super.getPrice() + drink.cost();
  }

  @Override
  public String getName() {
    return  name + " 单价为:" + getPrice() + " && " + drink.getName()  + " 单价为:" +  drink.getPrice();
  }
}
