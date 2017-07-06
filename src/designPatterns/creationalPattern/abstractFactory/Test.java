package designPatterns.creationalPattern.abstractFactory;

import designPatterns.creationalPattern.doMain.Sender;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
