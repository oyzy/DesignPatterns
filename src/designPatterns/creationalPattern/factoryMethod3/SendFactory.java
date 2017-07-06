package designPatterns.creationalPattern.factoryMethod3;

import designPatterns.creationalPattern.doMain.MailSend;
import designPatterns.creationalPattern.doMain.Sender;
import designPatterns.creationalPattern.doMain.SmsSend;

/**
 * Created by Administrator on 2017/7/6.
 */
public class SendFactory {
    public static Sender produceMail(){
        return new MailSend();
    }

    public static Sender prodrceSms(){
        return new SmsSend();
    }
}
