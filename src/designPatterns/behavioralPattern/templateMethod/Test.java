package designPatterns.behavioralPattern.templateMethod;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Test {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
