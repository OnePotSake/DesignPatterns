package creational.patterns.bridging.explate;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description test
 * @date 5/1/23 18:43:54
 */
public class Test {

  public static void main(String[] args) {
    Actor actor = new PlayActor(new ShowMannerIsGuitar());
    actor.showTime();

  }
}
