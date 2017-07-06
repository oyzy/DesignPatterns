package designPatterns.creationalPattern.factoryMethod;

import designPatterns.creationalPattern.doMain.Sender;

/**
 * Created by Administrator on 2017/7/6.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("mail");
        sender.send();
    }
}
