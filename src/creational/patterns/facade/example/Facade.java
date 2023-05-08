package creational.patterns.facade.example;

/**
 * @author spikeCong
 * @date 2022/10/5
 **/
public class Facade {

    private SystemA obj1 = new SystemA();
    private SystemB obj2 = new SystemB();

    public void method(){

        obj1.methodA();
        obj2.methodB();
    }

}
