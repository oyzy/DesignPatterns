package designPatterns.behavioralPattern.iterator;



/**
 * Created by Administrator on 2017/7/11.
 */
public interface Collection {

    Iterator iterator();

    //取得集合元素
    Object get(int i);

    //取得集合大小
    int size();

}
