package designPatterns.behavioralPattern.strategy;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Minus extends Calculator implements ICalculator{

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "-");
        return arrayInt[0] - arrayInt[1];
    }
}
