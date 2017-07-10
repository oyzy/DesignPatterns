package designPatterns.behavioralPattern.observer;

/**
 * Created by Administrator on 2017/7/10.
 */
public interface Subject {

    //增加观察者
    void add(Observer observer);

    //删除观察者
    void delete(Observer observer);

    //通知所有观察者
    void notifyObserver();

    //自身的操作
    void operation();
}
