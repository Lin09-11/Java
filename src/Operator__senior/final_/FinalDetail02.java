package Operator__senior.final_;

/**
 * @author lin
 * @creat 2022--11--20:38
 */
public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);

        //包装类,String 是final类，不能被继承

    }
}

//final 和 static 往往搭配使用，效率更高，不会导致类加载.底层编译器做了优化处理
//如果num不是final，则在类外部调用num的时候，整个BBB都被加载了，则会输出BBB 静态代码块被执行
//final和static的顺序无关先后
class BBB {
    public final static  int num = 10000;
    static {
        System.out.println("BBB 静态代码块被执行");
    }
}
final class AAA{
    //一般来说，如果一个类已经是final类了(fianl类不能被继承），就没有必要再将方法修饰成final方法
    //public final void cry() {}
}

