package creational.patterns.visitor.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 访问者接口 - 根据入参数不同,调用不同的接口
 * @date 5/5/23 03:49:59
 */
public interface Visitor {

  void visit(Candy candy); // 糖果

  void visit(Wine wine); // 酒水

  void visit(Fruit fruit); // 水果

}
