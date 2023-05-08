package creational.patterns.adapter.example;

/**
 * 电脑类
 * @author spikeCong
 * @date 2022/9/28
 **/
public class Computer {

    public String read(SDCard sdCard){

        String data = sdCard.read();
        return data;
    }
}
