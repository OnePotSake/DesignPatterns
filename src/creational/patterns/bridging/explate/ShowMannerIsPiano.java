package creational.patterns.bridging.explate;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 乐器表演基本功能
 * @date 5/1/23 18:31:36
 */
public class ShowMannerIsPiano implements MusicalInstrument {
  @Override
  public void palay() {
    System.out.println("乐器表演之钢琴");
  }
}
