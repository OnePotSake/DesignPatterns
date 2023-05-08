package creational.patterns.composite.example;

import java.util.ArrayList;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 树枝节点
 *   树枝节点类是一个容器对象,它既可以包含树枝节点也可以包含叶子节点
 *
 *  聚合 (文件加) 概念
 * @date 5/3/23 12:23:35
 */
public class Composite extends Component{

 private ArrayList<Component> list = new ArrayList<>();

  @Override
  public void add(Component component) {
    list.add(component);
  }

  @Override
  public void remove(Component component) {
   list.remove(component);
  }

  @Override
  public Component getChild(int i) {
   return list.get(i);
  }

  // 具体业务方法
  //具体业务方法
  @Override
  public void operation() {
   //在循环中,递归调用其他节点中的operation() 方法
   for (Component component : list) {
    component.operation();
   }
  }
  public Composite(ArrayList<Component> list) {
    this.list = list;
  }


}
