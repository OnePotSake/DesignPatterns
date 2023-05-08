package creational.patterns.strategy.example3;


import creational.patterns.strategy.example2.Receipt;

/**
 **/
public class MT2101ReceiptHandleStrategy implements ReceiptHandleStrategy {

    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文 MT2101: " + receipt.getMessage());
    }
}
