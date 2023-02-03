package Operator_junior;

/**
 * @author lin
 * @creat 2022--11--08 17:52
 */
public class RelationalOperator {

    public static void main(String[] args) {
        int a = 9; //老韩提示: 开发中，不可以使用 a, b
        int b = 8;
        System.out.println(a > b); //T
        System.out.println(a >= b); //T
        System.out.println(a <= b); //F
        System.out.println(a < b);//F
        System.out.println(a == b); //F
        System.out.println(a != b); //T
        boolean flag = a > b; //T
        System.out.println("flag=" + flag);
    }
}
