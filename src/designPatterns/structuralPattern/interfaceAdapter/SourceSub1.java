package designPatterns.structuralPattern.interfaceAdapter;

/**
 * Created by Administrator on 2017/7/6.
 */
public class SourceSub1 extends Wrapper {
    @Override
    public void method1() {
        System.out.println("接口的适配器..方法一...");
    }
}
