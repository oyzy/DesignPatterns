package designPatterns.behavioralPattern.templateMethod;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}
