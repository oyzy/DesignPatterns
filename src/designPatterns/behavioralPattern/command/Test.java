package designPatterns.behavioralPattern.command;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
