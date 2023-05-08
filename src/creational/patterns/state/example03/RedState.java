package creational.patterns.state.example03;



/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/4/23 22:55:06
 */
public class RedState implements State {

  @Override
  public void switchToGreen(TrafficLight trafficLight) {
    System.out.println("红灯不能切换绿灯!!");

  }

  @Override
  public void switchToRed(TrafficLight trafficLight) {
    System.out.println("无需切换!!,当前就是红灯");
  }

  @Override
  public void switchToYellow(TrafficLight trafficLight) {
    System.out.println("可以切换为黄灯,正在切换");

  }
}
