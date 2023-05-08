package creational.patterns.chain_of_responsibility.example2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 模拟审核服务
 * @date 5/4/23 08:27:53
 */
public class AuthService {

  // 审核信息, key 审批人id + 审批单id, value 审批时间
   private static Map<String, Date> authMap = new HashMap<>();


  public static void auth(String uId, String orderId) {
     System.out.println("进入审批流程, 审批人ID  " + uId);
     authMap.put(uId.concat(orderId), new Date());
   }

   /** @author: OnePotSake
   * @description: 获取审核通过日期
   * @date: 2023-05-04 15:19:48
    * @param0: usId
   * @param1: OrderId
   * @return java.util.Date
   */
   public static Date queryAuthInfo(String uId, String orderId) {
    // System.out.println("用户Id"+  uId    +  "审批单号:orderId :" +  orderId  + " ,获得审批日期为"    +  authMap.get(uId.concat(orderId)));
    return authMap.get(uId.concat(orderId));
  }

}

