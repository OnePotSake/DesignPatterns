package creational.patterns.adapter.example2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description SD card
 * @date 5/2/23 23:11:18
 */
public interface SDTFCard {



  String readTF();
  String writeTF (String msg);;
}
