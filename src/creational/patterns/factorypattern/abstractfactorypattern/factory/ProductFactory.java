package creational.patterns.factorypattern.abstractfactorypattern.factory;

import creational.patterns.factorypattern.abstractfactorypattern.factory.product.*;
/**
 * 抽象工厂: 在一个抽象工厂中可以声明多个工厂方法,用于创建不同类型的产品
 * 不同品牌
 */
public interface ProductFactory {


   // 抽象产品之电视工厂
   AbstraTV getTVFactory();

   // 抽象产品之冰箱 工厂
   AbstraFreezer getFreezerFactory();
}
