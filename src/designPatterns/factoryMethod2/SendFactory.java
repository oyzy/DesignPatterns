package designPatterns.factoryMethod2;

import designPatterns.doMain.MailSend;
import designPatterns.doMain.Sender;
import designPatterns.doMain.SmsSend;

/**
 * Created by Administrator on 2017/7/6.
 */
public class SendFactory {
    public Sender produceSms(){
        return new SmsSend();
    }
    public Sender produceMail(){
        return new MailSend();
    }
}
