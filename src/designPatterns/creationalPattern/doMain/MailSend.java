package designPatterns.creationalPattern.doMain;

/**
 * Created by Administrator on 2017/7/6.
 */
public class MailSend implements Sender {

    @Override
    public void send() {
        System.out.println("邮件发送");
    }
}
