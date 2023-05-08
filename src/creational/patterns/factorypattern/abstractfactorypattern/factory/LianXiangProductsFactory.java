package creational.patterns.factorypattern.abstractfactorypattern.factory;

import creational.patterns.factorypattern.abstractfactorypattern.factory.product.AbstraFreezer;
import creational.patterns.factorypattern.abstractfactorypattern.factory.product.AbstraTV;
import creational.patterns.factorypattern.abstractfactorypattern.factory.product.LianXiangFreezer;
import creational.patterns.factorypattern.abstractfactorypattern.factory.product.LianXiangTV;

public class LianXiangProductsFactory implements ProductFactory {

    @Override
    public AbstraTV getTVFactory() {
        return new LianXiangTV();
    }


    @Override
    public AbstraFreezer getFreezerFactory() {
        return new LianXiangFreezer();
    }
}
