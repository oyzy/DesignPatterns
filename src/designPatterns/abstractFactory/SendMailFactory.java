package designPatterns.abstractFactory;

import designPatterns.doMain.MailSend;
import designPatterns.doMain.Sender;

/**
 * Created by Administrator on 2017/7/6.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSend();
    }
}
