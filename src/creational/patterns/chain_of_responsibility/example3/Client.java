package creational.patterns.chain_of_responsibility.example3;


import creational.patterns.chain_of_responsibility.example2.AuthService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/4/23 20:18:06
 */
public class Client {

  public static void main(String[] args) throws ParseException {

    //定义责任链
    AuthLink authLink = new LevelAuthLink3("1000013", "李工")
        .appendNext(new LevelAuthLink2("1000012", "王经理")
            .appendNext(new LevelAuthLink("1000011", "罗总")));



    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date currentDate = f.parse("2023-11-18 23:49:46");

    System.out.println("测试结果：{}  ==> " +  authLink.doAuth("研发牛马", "1000998004813441", currentDate).toString());

//        // 模拟三级负责人审批
    AuthService.auth("1000013", "1000998004813441");
   System.out.println("测试结果：{}模拟三级负责人审批，王工");
   System.out.println("测试结果：{}" + authLink.doAuth("研发牛马", "1000998004813441", currentDate).toString());

//        // 模拟二级负责人审批
   AuthService.auth("1000012", "1000998004813441");
    System.out.println("测试结果：{}模拟二级负责人审批，张经理");
   System.out.println("测试结果：{}" + authLink.doAuth("研发牛马", "1000998004813441", currentDate).toString());

//        // 模拟一级负责人审批
    AuthService.auth("1000011", "1000998004813441");
  System.out.println("测试结果：{} 模拟一级负责人审批，段总");
 System.out.println("测试结果：{}" + authLink.doAuth("研发牛马", "1000998004813441", currentDate).toString());

  }
}
