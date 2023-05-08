package creational.patterns.chain_of_responsibility.example3;

import creational.patterns.chain_of_responsibility.example2.AuthInfo;
import creational.patterns.chain_of_responsibility.example2.AuthService;

import java.text.ParseException;
import java.util.Date;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/4/23 20:51:05
 */
public class LevelAuthLink2 extends AuthLink{


  private Date beginDate = sdf.parse("2023-11-11 00:00:00");

  private Date endDate = sdf.parse("2023-11-31 00:00:00");



  public LevelAuthLink2(String levelUserId, String levelUserName) throws ParseException {
    super(levelUserId, levelUserName);
  }


  @Override
  public AuthInfo doAuth(String uId, String orderId, Date authDate) {
    Date date = AuthService.queryAuthInfo(levelUserId, orderId);

    if(null == date) {
      return new AuthInfo("0002", "单号: " + orderId, "状态: 待二级审批人审批" , levelUserName);
    }


    AuthLink next= super.getNext();
    if(next == null) {
      return new AuthInfo("0002", "单号: " + orderId, "状态: 二级审批人审批完成, 审批人: " , levelUserName);
    }


    if(authDate.before(beginDate) || authDate.after(endDate)) {
     return new AuthInfo("0002", "单号: " + orderId, "状态二审核完成,审批人: " + levelUserName );

    }

    return next.doAuth(uId,orderId,authDate);
  }
}
