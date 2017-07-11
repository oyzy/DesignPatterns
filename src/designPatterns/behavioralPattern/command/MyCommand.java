package designPatterns.behavioralPattern.command;

/**
 * Created by Administrator on 2017/7/11.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
