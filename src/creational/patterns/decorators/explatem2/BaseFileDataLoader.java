package creational.patterns.decorators.explatem2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/2/23 21:58:26
 */
public class BaseFileDataLoader implements DataLoader {

  private String filePath;


  public BaseFileDataLoader(String filePath) {
    this.filePath = filePath;
  }

  @Override
  public String read() {

   /* try {
      String result = FileUtils.readFileToString(new File(filePath), "utf-8");
      return result;
    } catch (IOException e) {
      e.printStackTrace();
    }*/
    return null;
  }

  @Override
  public void write(String data) {
    /*try {

      FileUtils.writeStringToFile(new File(filePath),data,"utf-8");
    } catch (IOException e) {
      e.printStackTrace();
    }*/
  }
}
