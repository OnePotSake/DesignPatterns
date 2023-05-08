package creational.patterns.builder.complex.vo;

/**
 * 建造者除了 创建产品信息外,还常用于实体对喜的属性定义 便于理解,简化代码

 * 建造者模式:
 *   1.目标类的构造方法要传入一个Builder 对象
 *   2.builder类位于目标类的内部并使用static 装饰.
 *   3.builder类对象内置各种set方法,set方法的返回值是builder 本身
 *   4.builder 类提供一个 build() 方法,实现目标对象的创建
 */
public class RabbitMQclient3 {

    // 私有构造传入builder 类
    private RabbitMQclient3(Builder builder) {

    }


    // 静态内部类builder
    public static class Builder {

        // 保证属性的不可变性与密封性
        private String ip;
        private String host;
        private String message;

        private String dns;

        private String client;

        private String sendIpAddress;

        public Builder setHost(String host) {
            this.host = host;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setDns(String dns) {
            this.dns = dns;
            return this;
        }

        public Builder setClient(String client) {
            this.client = client;
            return this;
        }

        public Builder setIp(String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setSendIpAddress(String sendIpAddress) {
            this.sendIpAddress = sendIpAddress;
            return this;
        }

        // builder提供一个build方法,实现目标对象的创建
        public RabbitMQclient3 build() {
            if("0000".equals(ip)) {
                throw new RuntimeException("ip地址数据错误不能创建对象");
            }
            // .....


            return new RabbitMQclient3(this);
        }
    }

    public void sendMessage(String msg){

        System.out.println("发送消息......");
    }



    public static void main(String[] args) {
        RabbitMQclient3 builder = new Builder().setDns("123").setIp("0000").setHost("123123123").build();
        builder.sendMessage("没有问题");
    }

}
