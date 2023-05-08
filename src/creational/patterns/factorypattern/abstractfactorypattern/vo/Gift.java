package creational.patterns.factorypattern.abstractfactorypattern.vo;

/**
 * 品牌
 */
public class Gift {

    private String id;

    private Object data;
    private String userName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Gift( String id, String userName, Object data) {
        this.id = id;
        this.data = data;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "id='" + id + '\'' +
                ", data=" + data +
                ", userName='" + userName + '\'' +
                '}';
    }
}
