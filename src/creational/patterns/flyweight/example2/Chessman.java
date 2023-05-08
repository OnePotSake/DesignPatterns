package creational.patterns.flyweight.example2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 棋子方法
 * @date 5/3/23 14:04:55
 */
public abstract class Chessman {


  public abstract String getColor();

  public void display(){
    System.out.println("棋子颜色: " + this.getColor());
  }

}
