package Exception.throw_;

/**
 * @author lin
 * @creat 2022--11--12:10
 */
public class ThrowException {
    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ReturnExceptionDemo.methodB();

    }
}

class ReturnExceptionDemo {
    static void methodA() {
        try {
            System.out.println("进入方法A");//（1）
            //把异常语句当中返回语句，则要先将finally语句执行完后在执行throw语句
            throw new RuntimeException("制造异常");//（3）
        } finally {
            System.out.println("用A方法的finally");//（2）
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B");//（4）
            return;
        } finally {
            System.out.println("调用B方法的finally");//（5）
        }
    }
}


