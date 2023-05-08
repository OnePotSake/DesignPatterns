package creational.patterns.proxy.cglib;


/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description cglib 代理
 * @date 4/30/23 06:03:26
 *
 * 实现
 */
public class CglibProxy /* implements MethodInterceptor */ {

  /**
   * 生成CGLIB动态代理类方法
   * @param target    需要被代理的目标类
   * @return: java.lang.Object  代理类对象
   */
 /* @Override
  public Object getLogProxy(Object target)  {

    // 增强器类,用来创建爱代理对象
    Enhancer enhancer = new Enhancer();

    // 设置代理类的父类字节码对喜爱那个
    enhancer.setSupperclass(target.getClass());

    // 设置回调
    enhancer.setCallback(this);

    // 创建动态代理对象,并返回
    return enhancer.create();
  }*/

   /** 实现回调方法
     * @param o      代理对象
     * @param method  目标对象中的方法的Method实例
     * @param arges      实际参数
     * @param methodProxy  代理类对象中的方法的Method实例
     * @return: java.lang.Object
     */
  /* @Override
   public Object intercept(Object o, Method method , Object[] args, MethodProxy methodProxy) {
     Calendar instance = Calendar.getInstance();
     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:ss:mm");

     System.out.println(instance.getTime());
     Object result = (Object) methodProxy.invokeSuper(o, args);
     return null;
   }*/


}
