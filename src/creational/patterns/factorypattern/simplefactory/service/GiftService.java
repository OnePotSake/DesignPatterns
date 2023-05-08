package creational.patterns.factorypattern.simplefactory.service;

import creational.patterns.factorypattern.simplefactory.vo.Gift;

public interface GiftService {

    Gift getGift(String id, String name);
}
