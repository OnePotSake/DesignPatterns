package creational.patterns.decorators.explatem2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 抽象的文件读取接口
 * @date 5/2/23 22:00:42
 */
public interface DataLoader {

  String read();

  void write(String data);
}