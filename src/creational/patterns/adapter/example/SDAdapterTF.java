package creational.patterns.adapter.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 适配器 sd 兼容TF
 * @date 5/2/23 23:17:40
 */
public class SDAdapterTF extends SDTFCardImpl implements SDCard {

  @Override
  public String read() {
    return "转换" + readTF();
  }

  @Override
  public String write(String msg) {
    return "转换" + writeTF(msg);
  }
}
