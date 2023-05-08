package creational.patterns.builder.complex.vo;

public class Demo {
    public static void main(String[] args) {
        // 获取链接对象
        RabbitMQclient3 rabbitMQ3 = new RabbitMQclient3.Builder().setMessage("123123").build();
        System.out.println(rabbitMQ3.toString());
    }

}
