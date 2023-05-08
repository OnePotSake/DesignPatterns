package creational.patterns.decorators.explatem;

import lombok.Data;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 咖啡
 * @date 5/1/23 21:36:03
 */
@Data
public class Coffee extends Drink {
  public Coffee() {
    super();
  }

  @Override
  int cost() {
    return super.getPrice();
  }

  @Override
  public String getName() {
    return super.getName();
  }
}
