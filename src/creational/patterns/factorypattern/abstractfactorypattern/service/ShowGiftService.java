package creational.patterns.factorypattern.abstractfactorypattern.service;

import creational.patterns.factorypattern.abstractfactorypattern.factory.*;
import creational.patterns.factorypattern.abstractfactorypattern.factory.product.AbstraFreezer;
import creational.patterns.factorypattern.abstractfactorypattern.factory.product.AbstraTV;
import creational.patterns.factorypattern.abstractfactorypattern.vo.Gift;

/**
 * 礼物具体实现
 */
public class ShowGiftService {

    private AbstraTV tv;

    private AbstraFreezer freezer;

    private ProductFactory factory;

    public void getGift(String id, String name, String type, String giftNo) {
        factory = FactoryStaticMap.getProductFactory(type);

        this.tv = factory.getTVFactory();
        this.freezer = factory.getFreezerFactory();

        getGiftType(id, name, giftNo);
    }
    public void getGiftType(String id, String name,  String giftNo) {
        Gift gift = null;
        if("1".equals(giftNo)) {
            //电视
             gift = tv.getGift(id, name);
        } else if("2".equals(giftNo)) {
            // 冰箱
            gift =  freezer.getGift(id, name);
        }

        if(gift != null) {
            System.out.println(gift.toString());
        }
    }

}
