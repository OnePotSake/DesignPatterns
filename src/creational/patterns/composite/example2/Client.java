package creational.patterns.composite.example2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 12:59:27
 */
public class Client {

  public static void main(String[] args) {

    // 根节点
    Directory rootDir = new Directory("root");

    // 树枝节点
    Directory binDir = new Directory("bin");

    //向bin目录添加叶子节点
    binDir.add(new File("vi",10000));
    binDir.add(new File("test",20000));
    binDir.add(new File("test2",20000));

    Directory tmpDir = new Directory("tmp");

    Directory usrDir = new Directory("usr");
    Directory mysqlDir = new Directory("mysql");
    mysqlDir.add(new File("my.cnf",30));
    mysqlDir.add(new File("test.db",25000));
    usrDir.add(mysqlDir);

    //将所有子文件夹封装到根节点
    rootDir.add(binDir);
    rootDir.add(tmpDir);
    rootDir.add(usrDir);

    rootDir.printList("");

  }


}
