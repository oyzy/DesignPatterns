package designPatterns.behavioralPattern.iterator;

/**
 * Created by Administrator on 2017/7/11.
 */
public interface Iterator {

    //前移
    Object precious();

    //后移
    Object next();

    boolean hasNext();

    //取得第一个元素
    Object first();
}
