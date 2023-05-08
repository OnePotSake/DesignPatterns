package creational.patterns.builder.simple.controller;

import creational.patterns.builder.simple.builder.Builder;
import creational.patterns.builder.simple.builder.HaLuobikeBuilder;
import creational.patterns.builder.simple.director.Director;
import creational.patterns.builder.simple.vo.Bike;

/**
 * @description: 建造者模式
 * 可以预预防反序列化,
 */
public class RequestController {

    public static void main(String[] args) {

        // 创建制作人
        Builder haLuobikeBuilder = new HaLuobikeBuilder();

        // 创建车辆
        Director director = new Director(haLuobikeBuilder);

        Bike construct = director.construct();

    }

}
