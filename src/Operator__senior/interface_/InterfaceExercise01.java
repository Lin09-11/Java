package Operator__senior.interface_;

/**
 * @author lin
 * @creat 2022--11--23:04
 */
public class InterfaceExercise01 {
    public static void main(String[] args) {
        B1 b = new B1();//ok
        System.out.println(b.a1);  //23
        System.out.println(A1.a1);  //23
        System.out.println(B1.a1);  //23
    }
}

interface A1 {
    int a1 = 23; //等价 public static final int a = 23;
}

class B1 implements A1 {//正确
}

