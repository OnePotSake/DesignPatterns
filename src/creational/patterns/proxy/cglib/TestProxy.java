package creational.patterns.proxy.cglib;

/**
 * @author
 * @date 2022/9/22
 **/
public class TestProxy {




    public static void testStaticProxy(){
        //目标对象
        CglibServiceimpl userService = new CglibServiceimpl();
        System.out.println(userService.getClass());

        //代理对象
      /*  CglibServiceimpl proxy = (CglibServiceimpl) new CglibServiceimpl().getLogProxy(userService);
        System.out.println(proxy.getClass());

        List<User> list = proxy.findUserList();
        System.out.println("用户信息: " +list);*/

    }

    public static void main(String[] args) {
        testStaticProxy();
    }

}
