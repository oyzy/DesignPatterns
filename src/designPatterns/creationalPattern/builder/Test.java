package designPatterns.creationalPattern.builder;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Test {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);

    }
}
