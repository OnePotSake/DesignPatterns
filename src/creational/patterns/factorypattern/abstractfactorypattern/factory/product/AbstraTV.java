package creational.patterns.factorypattern.abstractfactorypattern.factory.product;


import creational.patterns.factorypattern.abstractfactorypattern.vo.Gift;

/**
 * 抽象产品: 定义产品规范,描述了产品的主要的特征和功能
 * @author spikeCong
 **/
public interface AbstraTV {

    Gift getGift(String id, String name);

}
