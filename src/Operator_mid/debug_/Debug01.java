package Operator_mid.debug_;

/**
 * @author lin
 * @creat 2022--11--23:21
 */
public class Debug01 {
    public static void main(String[] args) {
        //演示逐行执行代码
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sum=" + i);
        }
        System.out.println("退出for....");
    }
}

