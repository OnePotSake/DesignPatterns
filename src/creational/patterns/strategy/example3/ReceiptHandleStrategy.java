package creational.patterns.strategy.example3;


import creational.patterns.strategy.example2.Receipt;

/**
 * 回执处理策略接口
 * @author spikeCong
 * @date 2022/10/13
 **/
public interface ReceiptHandleStrategy {

    void handleReceipt(Receipt receipt);
}
