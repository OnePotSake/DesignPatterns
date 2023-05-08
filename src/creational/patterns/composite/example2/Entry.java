package creational.patterns.composite.example2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 12:52:50
 */
public abstract  class Entry {


  public abstract  String getName();

  public abstract  int getSize();

  public abstract  Entry add(Entry e);

  public abstract void printList(String prefix);

  @Override
  public String toString() {

    return getName() +"(" + getSize() +")";
  }

}
