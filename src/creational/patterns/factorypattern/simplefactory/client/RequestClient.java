package creational.patterns.factorypattern.simplefactory.client;

import creational.patterns.factorypattern.simplefactory.factory.GiftFactoryPattern;
import creational.patterns.factorypattern.simplefactory.vo.Gift;

import java.util.Random;

/**
 * 模拟请求入口
 */
public class RequestClient {


    public static void main(String[] args) {
        int number = new Random().nextInt(10);
        String userName = "张三";
        Gift gift = new GiftFactoryPattern().getGift(number + "", userName);



        System.out.println(gift.toString());

    }

}
