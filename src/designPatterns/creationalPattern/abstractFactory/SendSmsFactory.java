package designPatterns.creationalPattern.abstractFactory;

import designPatterns.creationalPattern.doMain.Sender;
import designPatterns.creationalPattern.doMain.SmsSend;

/**
 * Created by Administrator on 2017/7/6.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSend();
    }
}
