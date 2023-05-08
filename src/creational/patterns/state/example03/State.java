package creational.patterns.state.example03;


/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description  交通灯切换接口
 * @date 5/4/23 22:53:20
 */
public interface State {

  void switchToGreen(TrafficLight trafficLight);
  void switchToRed(TrafficLight trafficLight);
  void switchToYellow(TrafficLight trafficLight);

}
