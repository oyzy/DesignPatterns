package designPatterns.behavioralPattern.state;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Test {

    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();
        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
