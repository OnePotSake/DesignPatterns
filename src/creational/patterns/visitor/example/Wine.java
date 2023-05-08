package creational.patterns.visitor.example;

import java.time.LocalDate;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/5/23 03:40:11
 */
public class Wine  extends  Product implements Accetale{
  public Wine(String name, LocalDate productDate, double price) {
    super(name, productDate, price);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
