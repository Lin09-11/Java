package programControlStructure;

/**
 * @author lin
 * @creat 2022--11--09 0:26
 */
public class DoWhileExercise01 {

    public static void main(String[] args) {

        //统计 1---200 之间能被 5 整除但不能被 3 整除的 个数
        //化繁为简
        //(1) 使用 do-while 输出 1-200
        //(2) 过滤 能被 5 整除但不能被 3 整除的数 %
        //(3) 统计满足条件的个数 int count = 0;
        //先死后活
        //(1) 范围的值 1-200 你可以做出变量
        //(2) 能被 5 整除但不能被 3 整除的 , 5 和 3 可以改成变量
        int i = 1;
        int count = 0; //统计满足条件的个数
        do {
            if( i % 5 == 0 && i % 3 != 0 ) {
                System.out.println("i=" + i);
                count++;
            }
            i++;
        }while(i <= 200);
        System.out.println("count=" + count);
    }
}
