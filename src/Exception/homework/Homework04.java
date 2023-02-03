package Exception.homework;

/**
 * @author lin
 * @creat 2022--11--12:29
 */
public class Homework04 {
    public static void main(String[] args) {//main方法
        try {
            showExce();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");//（1）
        } finally {
            System.out.println("C");//（2）
        }
        //如果上面有异常，则下面的语句不再执行
        System.out.println("D");//（3）
    }

    public static void showExce() throws Exception {
        throw new Exception();
    }

}

