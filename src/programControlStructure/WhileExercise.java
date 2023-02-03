package programControlStructure;

/**
 * @author lin
 * @creat 2022--11--09 0:22
 */
public class WhileExercise {

    public static void main(String[] args) {

        // 打印 1—100 之间所有能被 3 整除的数 [使用 while, 老师评讲 ]
        // 化繁为简, 先死后活
        int i = 1;
        int endNum = 100;
        while( i <= endNum) {
            if( i % 3 == 0) {
                System.out.println("i=" + i);
            }
            i++;//变量自增
        }
        // 打印 40—200 之间所有的偶数 [使用 while, 课后练习]
        // 化繁为简, 先死后活(利于思考)

        System.out.println("========");
        int j = 40; //变量初始化
        while ( j <= 200) {
        //判断
            if( j % 2 == 0) {
                System.out.println("j=" + j);
            }
            j++;//循环变量的迭代
        }
    }
}
