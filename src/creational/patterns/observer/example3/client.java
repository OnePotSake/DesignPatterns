package creational.patterns.observer.example3;

import creational.patterns.observer.example2.LotteryResult;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 16:06:33
 */
public class client {

  public static void main(String[] args) {

    LotteryServiceImpl lotteryService = new LotteryServiceImpl();
    LotteryResult lotteryResult = lotteryService.lotteryAndMsg("215673512673512736125763");
    System.out.println(lotteryResult);
  }
}
