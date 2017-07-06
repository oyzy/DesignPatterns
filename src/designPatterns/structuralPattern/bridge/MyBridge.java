package designPatterns.structuralPattern.bridge;

/**
 * Created by Administrator on 2017/7/6.
 */
public class MyBridge extends Bridge {
    @Override
    public void method() {
        getSource().method();
    }
}
