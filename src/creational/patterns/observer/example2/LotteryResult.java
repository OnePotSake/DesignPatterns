package creational.patterns.observer.example2;

import lombok.Data;

import java.util.Date;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 观察者 (获奖人)
 * @date 5/3/23 15:57:12
 */
@Data
public class LotteryResult {


  private String uId; //用户id

  private String msg; //摇号信息

  private Date dateTime; //业务时间

  public LotteryResult(String uId, String msg, Date dateTime) {
    this.uId = uId;
    this.msg = msg;
    this.dateTime = dateTime;
  }

  @Override
  public String toString() {
    return "LotteryResult{" +
        "uId='" + uId + '\'' +
        ", msg='" + msg + '\'' +
        ", dateTime=" + dateTime +
        '}';
  }

}
