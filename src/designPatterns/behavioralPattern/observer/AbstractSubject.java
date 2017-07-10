package designPatterns.behavioralPattern.observer;

import com.sun.xml.internal.bind.v2.model.core.EnumConstant;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2017/7/10.
 */
public abstract class AbstractSubject implements Subject {
    private  Vector<Observer> vector = new Vector<Observer>();
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObserver() {
        Enumeration<Observer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement().update();
        }
    }


}
