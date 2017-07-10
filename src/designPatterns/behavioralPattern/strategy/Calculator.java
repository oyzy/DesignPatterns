package designPatterns.behavioralPattern.strategy;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Calculator {
    public int[] split(String exp, String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
