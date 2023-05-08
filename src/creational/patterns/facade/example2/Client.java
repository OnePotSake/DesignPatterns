package creational.patterns.facade.example2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 00:13:42
 */
public class Client {
  public static void main(String[] args) {
    System.out.println("主人快回来了");
    SmartAppliances smartAppliances = new SmartAppliances();
     smartAppliances.say("打开");


    System.out.println("主人要睡觉了");
    smartAppliances.say("g关闭");
    smartAppliances.close();



  }
}
