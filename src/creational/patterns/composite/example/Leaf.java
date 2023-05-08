package creational.patterns.composite.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description  * 叶子节点
 *     叶子节点中不能包含子节点
 *
 *     具体叶子(文件包含的功能)的实现
 *
 * @date 5/3/23 12:30:45
 */
public class Leaf  extends Component {
  @Override
  public void add(Component c) {

  }

  @Override
  public void remove(Component c) {

  }

  @Override
  public Component getChild(int i) {
    return null;
  }

  @Override
  public void operation() {
    //叶子节点中的具体方法
  }
}
