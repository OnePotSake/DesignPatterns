package creational.patterns.decorators.explatem2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 抽象方式子类
 * @date 5/2/23 22:02:08
 */
public class DataLoaderDecorator implements DataLoader  {

  private DataLoader dataLoader;

  public DataLoaderDecorator(DataLoader dataLoader) {
    this.dataLoader = dataLoader;
  }

  @Override
  public String read() {
    return dataLoader.read();
  }

  @Override
  public void write(String data) {
    dataLoader.write(data);
  }
}
