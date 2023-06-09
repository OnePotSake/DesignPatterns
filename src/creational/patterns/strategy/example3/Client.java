package creational.patterns.strategy.example3;


import creational.patterns.strategy.example2.Receipt;
import creational.patterns.strategy.example2.ReceiptBuilder;

import java.util.List;

/**
 **/
public class Client {

    public static void main(String[] args) {

        //模拟回执
        List<Receipt> receiptList = ReceiptBuilder.getReceiptList();

        //策略上下文
        ReceiptStrategyContext context = new ReceiptStrategyContext();

        //策略模式最主要的工作: 将策略的 定义, 创建, 使用这三部分进行了解耦.
        for (Receipt receipt : receiptList) {
            //获取策略
            ReceiptHandleStrategyFactory.init();
            ReceiptHandleStrategy strategy = ReceiptHandleStrategyFactory.getStrategy(receipt.getType());
            //设置策略
            context.setReceiptHandleStrategy(strategy);
            //执行策略
            context.handleReceipt(receipt);
        }

    }
}
