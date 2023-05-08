package creational.patterns.state.example03;

/**
 **/
public class Client {

    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToRed();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
    }
}
