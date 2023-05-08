package creational.patterns.visitor.example;

import java.time.LocalDate;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 水果类
 * @date 5/5/23 03:48:26
 */

public class Fruit extends Product implements  Accetale{

  private double weight;
  public Fruit(String name, LocalDate productDate, double price, double weight) {
    super(name, productDate, price);
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
