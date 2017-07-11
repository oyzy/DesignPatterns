package designPatterns.behavioralPattern.state;

/**
 * Created by Administrator on 2017/7/11.
 */
public class State {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1() {
        System.out.println("111111");
    }

    public void method2() {
        System.out.println("222222");
    }
}
