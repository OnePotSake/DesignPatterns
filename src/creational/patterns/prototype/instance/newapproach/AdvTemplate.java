package creational.patterns.prototype.instance.newapproach;

import lombok.Data;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 广告模板
 * @date 4/29/23 10:41:35
 */
@Data
public class AdvTemplate {

  private String advSubject = "xx银行本月还款达标,可抽iPhone 13等好礼!";

  //广告信内容
  private String advContext = "达标用户请在2022年3月1日到2022年3月30日参与抽奖......";

}
