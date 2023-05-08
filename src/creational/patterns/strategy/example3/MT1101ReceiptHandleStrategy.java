package creational.patterns.strategy.example3;


import creational.patterns.strategy.example2.Receipt;

/**
 * 具体策略类
 **/
public class MT1101ReceiptHandleStrategy implements ReceiptHandleStrategy {

    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文MT1101: " + receipt.getMessage());
    }
}
