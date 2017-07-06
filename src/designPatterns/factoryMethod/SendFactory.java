package designPatterns.factoryMethod;

import designPatterns.doMain.MailSend;
import designPatterns.doMain.Sender;
import designPatterns.doMain.SmsSend;

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
