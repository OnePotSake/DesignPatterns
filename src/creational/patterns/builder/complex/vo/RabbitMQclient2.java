package creational.patterns.builder.complex.vo;

/**
 * 建造者除了 创建产品信息外,还常用于实体对喜的属性定义 便于理解,简化代码
 * 如下:
 * 如果创建一个对象实例,属性信息过多,频繁set 属性
 * 或者用创建对想的构造器也不大便于阅读,也容易出错
 *
 */
public class RabbitMQclient2 {

    private String ip;
    private String host;
    private String message;

    private String dns;

    private String client;

    private String sendIpAddress;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        if("0000".equals(ip)) {
            throw new RuntimeException("ip地址数据错误不能创建对象");
        }

        this.ip = ip;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDns() {
        return dns;
    }

    public void setDns(String dns) {
        this.dns = dns;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getSendIpAddress() {
        return sendIpAddress;
    }

    public void setSendIpAddress(String sendIpAddress) {
        this.sendIpAddress = sendIpAddress;
    }




    public static void main(String[] args) {
        RabbitMQclient2 rabbitMQclient = new RabbitMQclient2();
        rabbitMQclient.setIp("0000");
        rabbitMQclient.setClient("2222");
    }

}
