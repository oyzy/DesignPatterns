package designPatterns.creationalPattern.builder;

import designPatterns.creationalPattern.doMain.MailSend;
import designPatterns.creationalPattern.doMain.Sender;
import designPatterns.creationalPattern.doMain.SmsSend;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSend());
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count; i++){
            list.add(new SmsSend());
        }
    }
}
