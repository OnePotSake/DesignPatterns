package creational.patterns.observer.example2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description  被观察者-- 奖池
 * @date 5/3/23 16:04:16
 */
public class DrawHouseService {

  public String lots(String uId){
    if(uId.hashCode() % 2 == 0){
      return "恭喜ID为: " + uId + " 的用户,在本次摇号中中签!" ;
    }else{
      return "很遗憾,ID为: " + uId + "的用户,您本次未中签!" ;
    }
  }

}
