package designPatterns.structuralPattern.decorator;

/**
 * Created by Administrator on 2017/7/6.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Decorator decorator = new Decorator(new Source());
        decorator.method();
    }
}
