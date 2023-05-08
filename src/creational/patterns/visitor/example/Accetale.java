package creational.patterns.visitor.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 接待接口分别计算商品价格
 * @date 5/5/23 03:39:27
 */
public interface Accetale {
  //接收所有的Visitor访问者的子类
  public void accept(Visitor visitor);
}
