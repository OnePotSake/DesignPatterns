package creational.patterns.adapter.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/2/23 23:12:21
 */
public class SDTFCardImpl implements SDTFCard{


  @Override
  public String readTF() {
    return  "read SDTFCard";
  }

  @Override
  public String writeTF(String msg) {
    return "write SDTFCard   " +  msg;
  }
}
