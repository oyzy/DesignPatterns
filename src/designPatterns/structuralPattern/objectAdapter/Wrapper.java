package designPatterns.structuralPattern.objectAdapter;

import designPatterns.structuralPattern.classAdapter.Source;
import designPatterns.structuralPattern.classAdapter.Targetable;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Wrapper implements Targetable {
    private Source source;
    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("方法二");
    }
}
