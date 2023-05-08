package creational.patterns.builder.complex.vo;

/**
 * 建造者除了 创建产品信息外,还常用于实体对喜的属性定义 便于理解,简化代码
 * 如下:
 * 如果创建一个对象实例,属性信息过多,频繁set 属性
 * 或者用创建对想的构造器也不大便于阅读,也容易出错
 *
 */
public class RabbitMQclient1 {

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


    public RabbitMQclient1(String ip, String host, String message, String dns, String client, String sendIpAddress) {
        this.ip = ip;
        this.host = host;
        this.message = message;
        this.dns = dns;
        this.client = client;
        this.sendIpAddress = sendIpAddress;

        if("0000".equals(ip)) {
            throw new RuntimeException("ip地址数据错误不能创建对象");
        }
    }

    public static void main(String[] args) {
        RabbitMQclient1 rabbitMQclient1 = new RabbitMQclient1("0000", null, null, null, null, null);
        rabbitMQclient1.setClient("1231");
    }

}
