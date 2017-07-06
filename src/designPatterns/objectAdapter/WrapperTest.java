package designPatterns.objectAdapter;

import designPatterns.classAdapter.Source;

/**
 * Created by Administrator on 2017/7/6.
 */
public class WrapperTest {
    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper(new Source());
        wrapper.method1();
        wrapper.method2();
    }
}
