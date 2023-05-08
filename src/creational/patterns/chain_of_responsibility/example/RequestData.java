package creational.patterns.chain_of_responsibility.example;

/**
 * 请求封装
 **/
public class RequestData {

    private String data;

    public RequestData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
