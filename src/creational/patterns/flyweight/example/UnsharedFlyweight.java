package creational.patterns.flyweight.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 非共享的
 * @date 5/3/23 13:33:56
 */
public class UnsharedFlyweight  extends Flyweight {

  private String inState;

  public UnsharedFlyweight(String inState) {
    this.inState = inState;
  }

  @Override
  public void operation(String state) {
    System.out.println("=== 使用不共享对象,内部状态: " + inState + ",外部状态: " + state );
  }

}
