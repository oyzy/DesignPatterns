package designPatterns.classAdapter;

/**
 * Created by Administrator on 2017/7/6.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
