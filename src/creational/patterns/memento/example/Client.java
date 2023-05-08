package creational.patterns.memento.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/8/23 13:38:44
 */
public class Client {

  public static void main(String[] args) {

           //创建发起人对象
    Originator o1 = new Originator();
    o1.setId("1");
    o1.setName("spike");
    o1.setPhone("13522777722");
    System.out.println("========"+o1);

    //创建负责人对象
    Careteaker caretaker = new Careteaker();
    caretaker.setMemento(o1.createMemento());

    //修改
    o1.setName("update");
    System.out.println("========" + o1);

    //从负责人对象中获取备忘录对象,实现恢复操作
    o1.restoreMemento(caretaker.getMemento());
    System.out.println("========" + o1);
  }
}
