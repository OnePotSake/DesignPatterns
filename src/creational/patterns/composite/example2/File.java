package creational.patterns.composite.example2;

import lombok.Data;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 12:52:50
 */
@Data
public class File extends Entry {

  private String name; //文件名
  private int size; //文件大小

  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getSize() {
    return this.size;
  }

  @Override
  public Entry add(Entry entry) {
    return null;
  }

  @Override
  public void printList(String prefix) {

    System.out.println(prefix + "/" + this);
  }


}