package designPatterns.structuralPattern.interfaceAdapter;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Test {
    public static void main(String[] args) {

        Wrapper wrapper1 = new SourceSub1();
        Wrapper wrapper2 = new SourceSub2();
        wrapper1.method1();
        wrapper1.method2();
        System.out.println("...............");
        wrapper2.method1();
        wrapper2.method2();
    }
}
