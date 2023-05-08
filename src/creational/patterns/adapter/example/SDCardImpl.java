package creational.patterns.adapter.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/2/23 23:12:21
 */
public class SDCardImpl  implements SDCard{


  @Override
  public String read() {
    return  "read SDCard";
  }

  @Override
  public String write(String msg) {
    return "write SDCard   " +  msg;
  }
}
