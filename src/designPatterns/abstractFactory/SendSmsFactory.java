package designPatterns.abstractFactory;

import designPatterns.doMain.Sender;
import designPatterns.doMain.SmsSend;

/**
 * Created by Administrator on 2017/7/6.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSend();
    }
}
