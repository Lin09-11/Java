package Operator_junior;

/**
 * @author lin
 * @creat 2022--11--08 20:07
 */
public class AssignOperator {

    public static void main(String[] args) {

        int n1 = 10;
        n1 += 4;// n1 = n1 + 4;
        System.out.println(n1); // 14
        n1 /= 3;// n1 = n1 / 3;//4
        System.out.println(n1); // 4
        //复合赋值运算符会进行类型转换
        byte b = 3;
//        b=b+2;//这样子写是错误的----没有类型转换
        b += 2; // 等价 b = (byte)(b + 2);
        b++; // b = (byte)(b+1);
    }
}
