package designPatterns.creationalPattern.singleton3;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton(){}

    private static synchronized void syncInit() {
        if (null == instance) {
            instance = new Singleton();
        }
    }

    public static Singleton getInstance() {
        if (null == instance) {
            syncInit();
        }
        return instance;
    }
}
