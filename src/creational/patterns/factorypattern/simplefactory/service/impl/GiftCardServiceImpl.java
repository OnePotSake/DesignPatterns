package creational.patterns.factorypattern.simplefactory.service.impl;

import creational.patterns.factorypattern.simplefactory.service.GiftService;
import creational.patterns.factorypattern.simplefactory.vo.Card;
import creational.patterns.factorypattern.simplefactory.vo.Gift;

import java.util.Random;

public class GiftCardServiceImpl implements GiftService {

    @Override
    public Gift getGift(String id, String name) {
         return new Gift(id, name, new Card("充值卡", new Random().nextInt(100)));
        }
}
