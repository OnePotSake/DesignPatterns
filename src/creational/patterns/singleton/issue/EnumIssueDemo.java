package creational.patterns.singleton.issue;

import java.io.*;

/**
 * 阻止反射方法中 通过反射创建对象 创建
 * 阻止序列化破坏,在序列化的时候仅仅是将序列化对象的name 属性输出到结果, 反序列化时候,就会通过
 * Enum 的 value 方法 来根据名字查找对应枚举对象
 *
 *
 */
public class EnumIssueDemo {

    public static void main(String[] args) throws Exception {

   /* Class<EnumDemo>  sig = EnumDemo.class;
    Constructor<EnumDemo> constructor = sig.getDeclaredConstructor();
    constructor.setAccessible(true);

    // newInstance 方法中 不能使用反射去序列化  if ((clazz.getModifiers() & Modifier.ENUM) != 0)
    EnumDemo demo =  constructor.newInstance();
    // 枚举 继承 Enum 构造函数中没有空参数构造, 填写 2 个参数后仍然报错.
    EnumDemo demo2 = constructor.newInstance(String.class, int.class);
*/


        ObjectOutputStream osout = new ObjectOutputStream(new FileOutputStream("tempFile.obj"));
        osout.writeObject(EnumDemo.getInstance());

        // 序列化对象输入流
        File file = new File("tempFile.obj");
        ObjectInputStream fileinput = new ObjectInputStream(new FileInputStream(file));
        EnumDemo demo =  (EnumDemo) fileinput.readObject();
        EnumDemo demo2 =  EnumDemo.getInstance();

    System.out.println(demo);
    System.out.println(demo2);
    System.out.println(demo2 == demo);


    }
}
