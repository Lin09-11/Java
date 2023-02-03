package Operator__senior.static_;

/**
 * @author lin
 * @creat 2022--11--22:27
 */
public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
//        n1--非静态变量，不能 不创建对象直接使用
        //System.out.println(B.n1);
        System.out.println(B.n2);

        //静态变量是类加载的时候，就创建了,所以我们没有创建对象实例
        //也可以通过类名.类变量名来访问
        System.out.println(C.address);

    }
}

class B {
    public  int n1 = 100;
    public static int n2 = 200;
}

class C {
    public static String address = "北京";
}
