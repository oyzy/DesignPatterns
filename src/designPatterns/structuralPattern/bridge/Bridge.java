package designPatterns.structuralPattern.bridge;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Bridge {
    private Sourceable source;
    public void method(){

        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
