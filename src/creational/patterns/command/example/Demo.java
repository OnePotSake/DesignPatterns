package creational.patterns.command.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/8/23 14:22:20
 */
public class Demo {
  public static void main(String[] args) {
    OrderInfo order1 = new OrderInfo();
    order1.setDiningTable(10);
    order1.getFoodMenu().put("鲍鱼炒饭",1);
    order1.getFoodMenu().put("海参炒面",1);

    OrderInfo order2 = new OrderInfo();
    order2.setDiningTable(15);
    order2.getFoodMenu().put("回锅肉盖饭",1);
    order2.getFoodMenu().put("木须肉盖饭",1);

    //创建接收者
    Chef chef = new Chef();

    //将订单和接收者封装成命令对象
    OrderCommand cmd1 = new OrderCommand(chef, order1);
    OrderCommand cmd2 = new OrderCommand(chef, order2);

    //创建调用者
    Waiter waiter = new Waiter();
    waiter.setCommand(cmd1);
    waiter.setCommand(cmd2);

    //将订单发送给厨师 上菜
    waiter.orderUp();

  }
}
