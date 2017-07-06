package designPatterns.structuralPattern.decorator;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Decorator implements Sourceable {

    private Sourceable source;
    public Decorator(Sourceable source){
        super();
        this.source = source;
    }
    @Override
    public void method() {
        System.out.println("...before...");
        source.method();
        System.out.println("...after...");
    }
}
