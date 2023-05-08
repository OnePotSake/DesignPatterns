package creational.patterns.command.example;


import java.util.Set;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 具体命令集合
 * @date 5/8/23 14:33:12
 */
public class OrderCommand implements Command {

  private Chef chef;

  private OrderInfo orderInfo;

  public Chef getChef() {
    return chef;
  }

  public void setChef(Chef chef) {
    this.chef = chef;
  }

  public OrderInfo getOrderInfo() {
    return orderInfo;
  }

  public void setOrderInfo(OrderInfo orderInfo) {
    this.orderInfo = orderInfo;
  }

  public OrderCommand(Chef chef, OrderInfo orderInfo) {
    this.chef = chef;
    this.orderInfo = orderInfo;
  }

  @Override
  public void execute() {

    System.out.println(orderInfo.getDiningTable() + "卓的订单");

    Set<String> keys = orderInfo.getFoodMenu().keySet();
    for (String key : keys) {
      chef.makeFood(orderInfo.getFoodMenu().get(key), key);
    }


    try {
      Thread.sleep(10000);

    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(orderInfo.getDiningTable() + "餐桌 菜品以上");
  }


}
