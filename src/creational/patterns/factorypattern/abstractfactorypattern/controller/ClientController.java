package creational.patterns.factorypattern.abstractfactorypattern.controller;

import creational.patterns.factorypattern.abstractfactorypattern.service.ShowGiftService;

public class ClientController {

    public static void main(String[] args) {



        String id = "1";
        String type = "2";
        String gitfNo = "2";
        String userName = "张三";
        new ShowGiftService().getGift(id, userName, type, gitfNo);
    }
}
