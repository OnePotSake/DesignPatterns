package creational.patterns.iterato.exxample;

import java.util.ArrayList;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/5/23 00:34:16
 */
public class Client {
  public static void main(String[] args) {
    ArrayList arrayList = new ArrayList();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);

    Iterator<Integer> iterator = new ConterIterator<>(arrayList);
    while(iterator.hashNext()) {
      System.out.println(iterator.currentItem());
      iterator.next();
    }

    System.out.println(" ======================原有迭代器");

    java.util.Iterator iterator1 = arrayList.iterator();
    while(iterator1.hasNext()) {
      System.out.println(iterator1.next());

    }


  }

}
