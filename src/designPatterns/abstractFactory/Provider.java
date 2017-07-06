package designPatterns.abstractFactory;

import designPatterns.doMain.Sender;

/**
 * Created by Administrator on 2017/7/6.
 */
public interface Provider {
    Sender produce();
}
