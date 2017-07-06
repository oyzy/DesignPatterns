package designPatterns.creationalPattern.factoryMethod;

import designPatterns.creationalPattern.doMain.MailSend;
import designPatterns.creationalPattern.doMain.Sender;
import designPatterns.creationalPattern.doMain.SmsSend;

/**
 * Created by Administrator on 2017/7/6.
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSend();
        } else if ("sms".equals(type)) {
            return new SmsSend();
        }else {
            System.out.println("未找到匹配类型");
            return null;
        }

    }
}
