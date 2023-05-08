package creational.patterns.decorators.explatem;

import lombok.Data;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 饮料抽象类
 * @date 5/1/23 21:34:03
 */
@Data
public abstract class Drink {
  // 价格
  public int price = 1;

  public String name = "咖啡";

  // 计算价格
  abstract  int cost();
}
