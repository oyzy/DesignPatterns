package designPatterns.factoryMethod3;

import designPatterns.doMain.MailSend;
import designPatterns.doMain.Sender;
import designPatterns.doMain.SmsSend;

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
