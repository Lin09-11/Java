package Operator_junior;

/**
 * @author lin
 * @creat 2022--11--08 17:46
 */
public class ArithmeticOperatorExercise01 {

    public static void main(String[] args) {

//         int i = 1;//i->1
//         i = i++; //规则使用临时变量: (1) temp=i;(2) i=i+1;(3)i=temp;
//         System.out.println(i); // 1
//         int i=1;
//         i=++i; //规则使用临时变量: (1) i=i+1;(2) temp=i;(3)i=temp;
//         System.out.println(i); //2


        // 测试输出
        int i1 = 10;
        int i2 = 20;
        int i = i1++;//先输出i=10,后面i=11在输出
        System.out.print("i="+i);//10
        System.out.println("i2="+i2);//20
        i = --i2;//此时i=19
        System.out.print("i="+i);//19
        System.out.println("i2="+i2);//19
    }
}
