package creational.patterns.factorypattern.abstractfactorypattern.vo;

import java.util.Random;

public class Freezer {
    private String name  ;

    // 面值
    private String faceValue ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public Freezer(String name) {
        this.name = name;
        setFaceValue();
    }

    private void setFaceValue() {
        this.faceValue = (new Random().nextInt(100)) + "";
    }

    @Override
    public String toString() {
        return "Freezer{" +
                "name='" + name + '\'' +
                ", faceValue=" + faceValue +
                '}';
    }
}
