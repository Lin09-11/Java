package programControlStructure;

/**
 * @author lin
 * @creat 2022--11--09 13:06
 */
public class BreakExercise01 {

    public static void main(String[] args) {

        //1-100 以内的数求和，求出 当和 第一次大于 20 的当前数 【for + break】
        //思路分析
        //1. 循环 1-100, 求和 sum
        //2. 当 sum > 20 时，记录下当前数，然后 break
        //3. 在 for 循环外部，定义变量 n , 把当前 i 赋给 n
        int sum = 0; //累积和
        //注意 i 的作用范围在 for{}
        int n = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;//累积
            if(sum > 20) {
                System.out.println("和>20 时候 当前数 i=" + i);
                n = i;
                break;
            }
        }
        System.out.println("当前数=" + n);
    }
}
