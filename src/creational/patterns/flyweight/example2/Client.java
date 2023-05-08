package creational.patterns.flyweight.example2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 14:02:53
 */
public class Client {

  public static void main(String[] args) {
    ChessFactory instance = ChessFactory.getInstance();

    //获取3颗黑子
    Chessman b1 = instance.getChessman("b");
    Chessman b2 = instance.getChessman("b");
    Chessman b3 = instance.getChessman("b");
    System.out.println("判断黑子是否是同一对象: " + (b1 == b2));

    Chessman w1 = instance.getChessman("w");
    Chessman w2 = instance.getChessman("w");
    System.out.println("判断白子是否是同一对象: " + (w1 == w2));

    //显示棋子
    b1.display();
    b2.display();
    b3.display();

    w1.display();
    w2.display();
  }
}
