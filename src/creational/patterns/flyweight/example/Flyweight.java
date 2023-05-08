package creational.patterns.flyweight.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 享元模式
 *
 * 主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 *
 * @date 5/3/23 13:16:11
 */
public abstract class Flyweight {

  public abstract void operation(String state);

}