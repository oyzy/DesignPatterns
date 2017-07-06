package designPatterns.creationalPattern.factoryMethod2;

import designPatterns.creationalPattern.doMain.MailSend;
import designPatterns.creationalPattern.doMain.Sender;
import designPatterns.creationalPattern.doMain.SmsSend;

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
