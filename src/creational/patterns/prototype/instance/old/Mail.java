package creational.patterns.prototype.instance.old;

import lombok.Data;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 邮件内容
 * @date 4/29/23 10:42:17
 */

@Data
public class Mail {

  private String  receiver;

  private String  subject;

  private String  appellation;

  private String  context;

  private String  tail;

  public Mail(AdvTemplate tem) {

    this.subject = tem.getAdvSubject();
    this.context = tem.getAdvContext();
  }

}
