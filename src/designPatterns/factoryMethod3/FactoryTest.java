package designPatterns.factoryMethod3;

import designPatterns.doMain.Sender;

/**
 * Created by Administrator on 2017/7/6.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.prodrceSms();
        sender.send();
    }
}
