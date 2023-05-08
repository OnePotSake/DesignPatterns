package creational.patterns.factorypattern.simplefactory.service.impl;

import creational.patterns.factorypattern.simplefactory.service.GiftService;
import creational.patterns.factorypattern.simplefactory.vo.Bag;
import creational.patterns.factorypattern.simplefactory.vo.Gift;

public class GiftBagServiceImpl implements GiftService {

    @Override
    public Gift getGift( String id, String name) {
         return new Gift(id, name, new Bag("新款书包"));
        }
}
