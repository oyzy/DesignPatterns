package designPatterns.behavioralPattern.strategy;

/**
 * Created by Administrator on 2017/7/10.
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2*8";
        ICalculator cal = new Multiply();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
