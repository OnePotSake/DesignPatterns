package creational.patterns.proxy.cglib;

import java.util.Collections;
import java.util.List;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 4/30/23 06:06:04
 */
public class CglibServiceimpl {
  //查询功能
  public List<User> zfindUserList(){

    return Collections.singletonList(new User("tom",23));
  }
}
