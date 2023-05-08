package creational.patterns.bridging.explate;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 表演者
 * @date 5/1/23 18:42:20
 */
public class PlayActor extends Actor{

  public PlayActor(MusicalInstrument mic) {
    super(mic);
  }

  @Override
  protected void showTime() {
    mic.palay();
    System.out.println("xxx 开始 钢琴表演");
  }


}
