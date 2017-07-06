package designPatterns.structuralPattern.bridge;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Test {
    public static void main(String[] args) {

        Bridge bridge = new MyBridge();

        /*调用第一个对象*/
        Sourceable sourceable1 = new SourceSub1();
        bridge.setSource(sourceable1);
        bridge.method();
        System.out.println("...............");
        /*调用第二个对象*/
        Sourceable sourceable2 = new SourceSub2();
        bridge.setSource(sourceable2);
        bridge.method();
    }
}
