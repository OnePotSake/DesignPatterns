package creational.patterns.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 动态代理工厂
 * @date 4/29/23 11:40:53
 */
public class ProxyFactory {

  // 代理目标
  private Object target;


  public ProxyFactory (Object target) {
    this.target = target;
  }

  public Object getProxyInstance() {
    return Proxy.newProxyInstance(
        //目标类使用的类加载器
        target.getClass().getClassLoader(),
        //目标对象实现的接口类型
        target.getClass().getInterfaces(),
        new InvocationHandler() { //事件处理器

          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            System.out.println("开启事务");
            method.invoke(target,args);
            System.out.println("提交事务");
            return null;
          }
        }
    );
  }


}
