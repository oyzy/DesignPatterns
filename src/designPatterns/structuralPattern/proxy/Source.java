package designPatterns.structuralPattern.proxy;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("代理模式");
    }
}
