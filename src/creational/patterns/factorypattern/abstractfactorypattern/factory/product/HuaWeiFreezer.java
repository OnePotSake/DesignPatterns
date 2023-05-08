package creational.patterns.factorypattern.abstractfactorypattern.factory.product;

import creational.patterns.factorypattern.abstractfactorypattern.vo.Freezer;
import creational.patterns.factorypattern.abstractfactorypattern.vo.Gift;

public class HuaWeiFreezer implements AbstraFreezer {
    @Override
    public Gift getGift(String id, String name) {
        return new Gift(id, name,
                new Freezer("Huawei freezer")
        );
    }
}
