package designPatterns.behavioralPattern.command;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }
}
