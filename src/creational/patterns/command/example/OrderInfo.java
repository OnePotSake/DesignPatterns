package creational.patterns.command.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 订单信息
 * @date 5/8/23 14:28:46
 */
public class OrderInfo {

  private int diningTable;  //餐桌号码

  private Map<String,Integer> foodMenu = new HashMap<>();  //存储菜名和份数

  public int getDiningTable() {
    return diningTable;
  }

  public void setDiningTable(int diningTable) {
    this.diningTable = diningTable;
  }

  public Map<String, Integer> getFoodMenu() {
    return foodMenu;
  }

  public void setFoodMenu(Map<String, Integer> foodMenu) {
    this.foodMenu = foodMenu;
  }



  //
}
