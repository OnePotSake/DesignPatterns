package creational.patterns.state.example03;



/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/4/23 22:55:27
 */
public class YellowState implements State{
  @Override
  public void switchToGreen(TrafficLight trafficLight) {
    System.out.println("可以切换为绿灯, 正在切换");
  }

  @Override
  public void switchToRed(TrafficLight trafficLight) {
    System.out.println("可以切换为红灯,正在切换");
  }

  @Override
  public void switchToYellow(TrafficLight trafficLight) {
    System.out.println("当前为黄灯, 无需再次切换...");
  }
}
