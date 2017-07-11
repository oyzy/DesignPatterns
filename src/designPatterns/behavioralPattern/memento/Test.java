package designPatterns.behavioralPattern.memento;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Test {
    public static void main(String[] args) {
        //创建原始类
        Original original = new Original("egg");

        //创建备忘录
        Storage storage = new Storage(original.createMemento());

        //修改原始类的状态
        System.out.println("初始化的状态为："+original.getValue());
        original.setValue("niu");
        System.out.println("修改后的状态为："+original.getValue());

        //回复原始类的状态
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为："+original.getValue());
    }
}
