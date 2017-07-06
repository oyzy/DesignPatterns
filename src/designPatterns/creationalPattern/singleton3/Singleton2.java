package designPatterns.creationalPattern.singleton3;

import java.util.Vector;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Singleton2 {
    private static Singleton2 instance = null;
    private Vector propreties = null;

    public Vector getPropreties(){
        return propreties;
    }

    private Singleton2(){}

    private static synchronized void syncInit(){
        if (null == instance) {
            instance = new Singleton2();
        }
    }

    public static Singleton2 getInstance(){
        if (null == instance) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties(){
        Singleton2 singleton2 = new Singleton2();
        propreties = singleton2.getPropreties();
    }
}
