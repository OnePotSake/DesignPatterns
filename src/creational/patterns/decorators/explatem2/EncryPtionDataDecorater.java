package creational.patterns.decorators.explatem2;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/2/23 22:01:39
 */
public class EncryPtionDataDecorater extends DataLoaderDecorator {


  public EncryPtionDataDecorater(DataLoader dataLoader) {
    super(dataLoader);
  }


  //  读操作
  @Override
  public String read() {
    return super.read();
  }

  // 写操作
  @Override
  public void write(String data) {
    super.write(data);
  }


  // 加密操作
  public String encode(String data) throws UnsupportedEncodingException {
    System.out.println("进行了加密");
    Base64.Encoder encoder = Base64.getEncoder();
    byte[] bytes = data.getBytes("UTF-8");
   String ourStr = encoder.encodeToString(bytes);
    return ourStr;
  }

  // 解密操作
  public String decode(String data) throws UnsupportedEncodingException {
    System.out.println("进行了解密");
    Base64.Decoder decode = Base64.getDecoder();
    String result = new String(decode.decode(data),"utf-8");

    return result;
  }
}
