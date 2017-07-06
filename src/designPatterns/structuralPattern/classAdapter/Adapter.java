package designPatterns.structuralPattern.classAdapter;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("类的适配器22");
    }
}
