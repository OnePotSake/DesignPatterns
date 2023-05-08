package creational.patterns.observer.example2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 15:56:08
 */
public interface LotteryService {
  //开奖之后的业务操作
  public LotteryResult lottery(String uId);

}
