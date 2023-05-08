package creational.patterns.chain_of_responsibility.example2;

/**
 * 封装审批流程
 **/
public class AuthInfo {

    private String code; //状态码

    private String info = ""; //审核相关信息

    // 为了更好展示 审核信息 采用 一个可变长度的参数列表 ... ,
    public AuthInfo(String code, String... infos) {
        this.code = code;
        for (String str : infos) {
            // concat 拼接字符串
            this.info = info.concat(str+ " ");
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "AuthInfo{" +
                "code='" + code + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

}
