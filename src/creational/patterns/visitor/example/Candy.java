package creational.patterns.visitor.example;

import java.time.LocalDate;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 糖果类
 * @date 5/5/23 03:39:48
 */
public class Candy extends Product implements Accetale {



  public Candy(String name, LocalDate productDate, double price) {
    super(name, productDate, price);
  }


  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
