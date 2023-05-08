package creational.patterns.factorypattern.abstractfactorypattern.factory.product;

import creational.patterns.factorypattern.abstractfactorypattern.vo.*;

/**
 * 抽象产品
 * @author spikeCong
 * @date 2022/9/15
 **/
public interface AbstraFreezer {
    Gift getGift(String id, String name);
}
