package creational.patterns.factorypattern.simplefactory.vo;

import java.util.Random;

public class Card {
    private String name  ;

    // 面值
    private int faceValue ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public Card(String name, int faceValue) {
        this.name = name;
        this.faceValue = faceValue;
    }

    private void setFaceValue() {
        this.faceValue = (new Random().nextInt(100));
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", faceValue=" + faceValue +
                '}';
    }
}
