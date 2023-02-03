package Exception.homework;

/**
 * @author lin
 * @creat 2022--11--12:27
 */
public class Homework03 {
    public static void func() {//静态方法
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");//（1）
        }
    }

    public static void main(String[] args) {//main方法
        try {
            func();//当在try中出现异常，则异常后面的语句不在执行
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");//（2）
        }
        System.out.println("D");//（3）
    }
}

