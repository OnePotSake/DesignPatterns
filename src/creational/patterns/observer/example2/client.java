package creational.patterns.observer.example2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 16:06:33
 */
public class client {

  public static void main(String[] args) {
    LotteryService lotteryService = new LotteryServiceImpl();
    LotteryResult lottery = lotteryService.lottery("2");
    System.out.println(lottery.toString());

  }
}
