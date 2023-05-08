package creational.patterns.iterato.exxample2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 具体迭代实现
 * @date 5/5/23 00:50:18
 */
public class TopIterator implements AbIterator<Topic> {

  // topic 数组
  private  Topic[] topics;

  // 记录游标
  private int cursor;

  public TopIterator(Topic[] topics) {
    this.topics = topics;
  }

  @Override
  public void rnext() {
    // 游标重置
    this.cursor = 0;

  }

  @Override
  public Topic next() {

    return topics[cursor++];
  }

  @Override
  public Topic currentItem() {

    return topics[cursor];
  }

  @Override
  public boolean hashNext() {
    return (cursor >= topics.length) ?  false :  true ;
  }
}
