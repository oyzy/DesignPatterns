package designPatterns.creationalPattern.doMain;

/**
 * Created by Administrator on 2017/7/6.
 */
public class SmsSend implements Sender {
    @Override
    public void send() {
        System.out.println("短信发送");
    }
}
