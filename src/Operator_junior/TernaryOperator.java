package Operator_junior;

/**
 * @author lin
 * @creat 2022--11--08 20:17
 */
public class TernaryOperator {

    public static void main(String[] args) {

        int a = 10;
        int b = 99;
        // 解读
        // 1. a > b 为 false
        // 2. 返回 b--, 先返回 b 的值,然后在 b-1
        // 3. 返回的结果是 99
        int result = a > b ? a++ : b--;//此时a>b 为真，则 b--不会执行
        System.out.println("result=" + result);//99
        System.out.println("a=" + a);//10---a不执行
        System.out.println("b=" + b);//98
    }
}
