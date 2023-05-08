package creational.patterns.factorypattern.abstractfactorypattern.factory;

import creational.patterns.factorypattern.abstractfactorypattern.factory.product.AbstraFreezer;
import creational.patterns.factorypattern.abstractfactorypattern.factory.product.AbstraTV;
import creational.patterns.factorypattern.abstractfactorypattern.factory.product.HuaWeiFreezer;
import creational.patterns.factorypattern.abstractfactorypattern.factory.product.HuaWeiTV;

public class HuaWeiProductsFactory implements ProductFactory {

    @Override
    public AbstraTV getTVFactory() {
        return new HuaWeiTV();
    }


    @Override
    public AbstraFreezer getFreezerFactory() {
        return new HuaWeiFreezer();
    }
}
