package creational.patterns.composite.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 组合模式- 抽象根节点
 * 对客户端,只需要针对抽象编程,,无需关心具体子类是熟知节点还是根节点
 *
 *
 *  可以是接口, 也可以是 抽象类, 主要还是定节点功能
 *
 * @date 5/3/23 12:21:58
 */
public abstract class Component {




  public abstract  void add(Component c); //增加节点
  public abstract void remove(Component c); //删除节点
  public abstract Component getChild(int i); //获取节点
  public abstract void operation(); //业务方法

}
