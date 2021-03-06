package p01.designpattern.modelmethod;

/**
 * @author: ymm
 * @date: 2022/5/6
 * @version: 1.0.0
 * @description:
 */
public abstract class AbstractCalculator {
    // 自定义成员方法，实现将参数指定的表达式按照参数指定的规则进行切割并返回计算结果 1+1
    public int splitExpression(String exp, String op) {
        String[] sArr = exp.split(op);
        return calculate(Integer.parseInt(sArr[0]), Integer.parseInt(sArr[1]));
    }

    public abstract int calculate(int a, int b);

}
