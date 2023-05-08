package creational.patterns.decorators.explatem;

import lombok.Data;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 橙汁
 * @date 5/1/23 21:36:03
 */

@Data
public class ItalianCoffee extends Coffee{

  private String name = "意大利豈非";

  public ItalianCoffee(Drink drink) {
    setName("意大利豈非");
    setPrice(2);
  }



}
