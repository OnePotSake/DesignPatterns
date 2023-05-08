package creational.patterns.factorypattern.simplefactory.factory;

import creational.patterns.factorypattern.simplefactory.service.impl.GiftBagServiceImpl;
import creational.patterns.factorypattern.simplefactory.service.impl.GiftCardServiceImpl;
import creational.patterns.factorypattern.simplefactory.vo.Gift;

public class GiftFactoryPattern  {
    public Gift getGift(String id, String name) {

        if("1".equals(id) || "3".equals(id) || "5".equals(id) || "7".equals(id) || "9".equals(id)) {
            return new GiftCardServiceImpl().getGift(id, name);

        } else if ("2".equals(id) || "4".equals(id) || "6".equals(id)|| "8".equals(id)) {
            return new GiftBagServiceImpl().getGift(id, name);
        }

        return null;
    }
}
