package creational.patterns.memento.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 负责保存备忘录角色
 * @date 5/8/23 13:38:10
 */

public class Careteaker {

  private Memento memento ;

  public Memento getMemento() {
    return memento;
  }

  public void setMemento(Memento memento) {
    this.memento = memento;
  }
}
