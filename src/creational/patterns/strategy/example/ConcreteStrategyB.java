package creational.patterns.strategy.example;

/**
 * @author spikeCong
 * @date 2022/10/13
 **/
public class ConcreteStrategyB implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("执行策略B");
    }
}
