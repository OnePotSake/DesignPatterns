package creational.patterns.iterato.exxample2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 具体集合类
 * @date 5/5/23 03:15:17
 */
public class TopList implements AbList<Topic>{


  private Topic[] tipics;

  public TopList(Topic[] tipics) {
    this.tipics = tipics;
  }

  @Override
  public AbIterator<Topic> iterator() {
    return new TopIterator(tipics);
  }
}
