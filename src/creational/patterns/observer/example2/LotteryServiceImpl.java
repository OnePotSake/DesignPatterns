package creational.patterns.observer.example2;

import java.util.Date;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description  观察者 --- 奖池
 * @date 5/3/23 15:59:20
 */
public class LotteryServiceImpl implements LotteryService {


  //注入摇号服务
  private DrawHouseService houseService = new DrawHouseService();

  @Override
  public LotteryResult lottery(String uId) {

    String lots = houseService.lots(uId);

    //1.摇号
    String result = houseService.lots(uId);
    return new LotteryResult(uId,result,new Date());
  }

}
