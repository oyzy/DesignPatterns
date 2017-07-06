package designPatterns.structuralPattern.facade;

/**
 * Created by Administrator on 2017/7/6.
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        System.out.println("................");
        computer.shutdown();
    }
}
