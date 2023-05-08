package creational.patterns.adapter.example2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 适配器 sd 兼容TF
 * @date 5/2/23 23:17:40
 */
public class SDAdapterTF  implements SDCard {

  private SDTFCard sdtfCard;

  public SDAdapterTF(SDTFCard sdtfCard) {
    this.sdtfCard = sdtfCard;
  }

  @Override
  public String read() {
    return "转换" + sdtfCard.readTF();
  }

  @Override
  public String write(String msg) {
    return "转换" + sdtfCard.writeTF(msg);
  }
}
