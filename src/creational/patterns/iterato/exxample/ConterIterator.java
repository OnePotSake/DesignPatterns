package creational.patterns.iterato.exxample;

import java.util.ArrayList;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/5/23 00:27:21
 */
public class ConterIterator<E> implements Iterator{


  private int cursor; // 游标

  private ArrayList<E> arrayList; // 容器

  public ConterIterator( ArrayList<E> arrayList) {
    this.cursor = 0;
    this.arrayList  = arrayList;
  }

  @Override
  public boolean hashNext() {
    return cursor != arrayList.size();
  }

  @Override
  public void next() {
    cursor++;
  }

  @Override
  public Object currentItem() {

    if(cursor >= arrayList.size()) {
      throw new RuntimeException("超过界限");
    }


    return arrayList.get(cursor);
  }
}
