package creational.patterns.chain_of_responsibility.example;

/**
 * 抽象的处理者类
 * 定义一个后继处理变量
 * 定义抽象处理方法
 **/
public abstract class Handler {

    //后继处理者的引用
    protected Handler successor;

    // 为后继引用传递
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle(RequestData requestData);
}
