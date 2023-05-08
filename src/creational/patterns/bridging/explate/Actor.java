package creational.patterns.bridging.explate;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 抽象演员类
 * @date 5/1/23 18:37:39
 */

public abstract class Actor {

  // 乐器
  public MusicalInstrument mic;

   public Actor(MusicalInstrument mic) {
     super();
     this.mic = mic;

  }

  // 表演
    abstract protected  void showTime();

}
