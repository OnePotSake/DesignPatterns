package creational.patterns.state.example03;



/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/4/23 22:55:48
 */
public class GreenState implements State{
  @Override
  public void switchToGreen(TrafficLight trafficLight) {
    System.out.println("当前为绿灯,无需切换!!!");
  }

  @Override
  public void switchToRed(TrafficLight trafficLight) {
    System.out.println("当前为绿灯,正在切换为红灯");
  }

  @Override
  public void switchToYellow(TrafficLight trafficLight) {
    System.out.println("当前为绿灯,正在切换为黄灯");
  }
}
