package designPatterns.behavioralPattern.chainOfResponsibility;

/**
 * Created by Administrator on 2017/7/11.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private  String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if (null != getHandler()) {
            getHandler().operator();
        }
    }
}
