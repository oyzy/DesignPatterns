package designPatterns.behavioralPattern.observer;

/**
 * Created by Administrator on 2017/7/10.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("自身的操作");
        notifyObserver();
    }
}
