package designPatterns.creationalPattern.prototype;

/**
 * Created by Administrator on 2017/7/6.
 */
public class Prototype implements Cloneable{

    public Object clone() throws CloneNotSupportedException{
        //因为Cloneable接口是个空接口，super.clone()调用的是Object的clone()方法
        Prototype prototype = (Prototype)super.clone();
        return prototype;
    }


}
