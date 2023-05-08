package creational.patterns.command.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 厨师类
 * @date 5/8/23 14:31:59
 */
public class Chef {



  public void makeFood(int num , String foodName){
    System.out.println(num + "份, " + foodName);
  }

}
