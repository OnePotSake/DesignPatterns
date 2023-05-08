package creational.patterns.chain_of_responsibility.example2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 审核申请接口
 * @date 5/4/23 15:24:49
 */
public class AuthController {

   /** @author: OnePotSake
   * @description: 审核方法
   * @date: 2023-05-04 15:29:46
    * @param0: name 申请人
  * @param1: orderId 申请单号
  * @param2: authDate 时间
   * @return creational.patterns.chain_of_responsibility.example2.AuthInfo
   */
    public AuthInfo doAuth(String name , String orderId, Date authDate) throws ParseException {
      Date date = null;

      // 查询用户是否存在审核信息, 如果存在审核信息,则直接返回, 这里模拟用户 10001
      date = AuthService.queryAuthInfo("1000013", orderId);

      if(date ==null) {
        return new AuthInfo("0001", "单号: " +  orderId, "状态: 等待三级级审批人进行审批" );

      }

      /* 二级审核
         查询是否存在审核信息,虚拟二级审核人 10002
      * */

      // 查询是否存在审核信息, 虚拟二级审核人Id: 10002, 二级审核人审核单的时间范围为: 10.01~10.10号
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      if(authDate.after(sdf.parse("2023-10-01 00:00:00"))  && authDate.before(sdf.parse("2023-11-11 00:00:00"))) {

        date = AuthService.queryAuthInfo("1000012", orderId);

        if(date ==null) {
          return new AuthInfo("0002", "单号: " +  orderId, "状态: 等待二级审批人进行审批" );

        }

      }



      // 一级审批人
      if(authDate.after(sdf.parse("2023-10-10 00:00:00"))  && authDate.before(sdf.parse("2023-10-31 00:00:00"))) {

        date = AuthService.queryAuthInfo("1000011", orderId);

        if(date ==null) {
          return new AuthInfo("0001", "单号: " +  orderId,  "状态: 等待一级级级审批人进行审批" );

        }

      }

      return  new AuthInfo("0001", "单号: " +  orderId,  "审批完成" );

    }

}
