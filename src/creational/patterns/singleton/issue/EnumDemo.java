package creational.patterns.singleton.issue;

/**
 * 单例子模式 枚举
 */
public enum EnumDemo {

    INSTANCE;

    private Object date;

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public static EnumDemo getInstance() {
        return INSTANCE;
    }
}
