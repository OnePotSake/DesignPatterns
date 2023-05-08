package creational.patterns.singleton.issue;

import java.io.*;

/**
 * 序列化对于单例的危害
 */
public class DeserializationDemo {

    public static void main(String[] args) throws Exception {

        // 序列化对象输出流  事先写入对象信息
        ObjectOutputStream osout = new ObjectOutputStream(new FileOutputStream("tempFile.obj"));
        osout.writeObject(Singleton.getSigleton());

        // 序列化对象输入流
        File file = new File("tempFile.obj");
        ObjectInputStream fileinput = new ObjectInputStream(new FileInputStream(file));
        Singleton demo =  (Singleton) fileinput.readObject();

        System.out.println(demo);
        System.out.println(Singleton.getSigleton());
        System.out.println(demo ==  Singleton.getSigleton());

    }

}


class Singleton implements  Serializable {
    private volatile static Singleton singleton;

    private Singleton() {

    }


    public static Singleton getSigleton() {

        if(singleton == null) {

            synchronized (Singleton.class) {

                if(singleton == null) {
                    singleton = new Singleton();
                }

            }
        }

        return singleton;
    }

    /*
     * 没有以下方法,序列化生成实例时会存在生成流对象存在不同地址
     *  OjbectInputStream 类中
     *  private Object readObject0(Class<?> type, boolean unshared) 方法中,通过序列化狗在对象时 存在以下内容
      当序列化构造的时是对象时 调用 checkResolve 方法
     *  case TC_OBJECT:
     *                     if (type == String.class) {
     *                         throw new ClassCastException("Cannot cast an object to java.lang.String");
     *                     }
     *                     return checkResolve(readOrdinaryObject(unshared));
     *
     *  其中 readOrdinaryObject 方法中有
     *
     *  isInstantiable() 如果一个实现序列化借口的类,可以在运行时被实例化,就返回true
     *  desc.newInstance() 通过反射调用无参构造创建一个新的对象
     *
     *    obj = desc.isInstantiable() ? desc.newInstance() : null;
     *
     *     if (obj != null &&
     *             handles.lookupException(passHandle) == null &&
     *
     *             // 如果实现了序列化借口类中包含readResolve 方法 就返回true
     *             desc.hasReadResolveMethod()) {
     *
     *             // 通过反射的方式调用反序列化类的readResolve 方法
     *                  Object rep = desc.invokeReadResolve(obj);
     *                  .....
     *             }
     *
     * 说白了程序序列化 生成对象时会判断是否生成了readResolve 方法,生成此方法时根据类中的方法返回对象
     */
    private Object readResolve () {

        return singleton;
    }
}
