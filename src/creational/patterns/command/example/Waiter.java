package creational.patterns.command.example;

import java.util.ArrayList;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/8/23 14:54:16
 */
public class Waiter {

  private ArrayList<Command> commands;

  public ArrayList<Command> getCommands() {
    return commands;
  }

  public void setCommands(ArrayList<Command> commands) {
    this.commands = commands;
  }

  public Waiter() {
    this.commands = new ArrayList<>();
  }

  public Waiter(ArrayList<Command> commands) {
    this.commands = commands;
  }

  public void setCommand(Command command) {
    this.commands.add(command);
  }


  // 发出命令
  public void orderUp() {
    System.out.println("叮咚!!!");

    for ( Command command: commands) {


      if(command != null) {

        command.execute();
      }


    }


  }




}
