package creational.patterns.factorypattern.abstractfactorypattern.factory.product;


import creational.patterns.factorypattern.abstractfactorypattern.vo.Gift;
import creational.patterns.factorypattern.abstractfactorypattern.vo.TV;

public class HuaWeiTV implements AbstraTV {


    @Override
    public Gift getGift(String id, String name) {
        return new Gift(id, name, new TV(name));
    }
}
