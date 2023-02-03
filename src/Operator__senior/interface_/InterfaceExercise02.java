package Operator__senior.interface_;

/**
 * @author lin
 * @creat 2022--11--23:37
 */
public class InterfaceExercise02 {
    public static void main(String[] args) {

    }
}

interface A2 {  // 1min 看看
    int x = 0;
}  //想到 等价 public static final int x = 0;

class B2 {
    int x = 1;
} //普通属性

class C2 extends B2 implements A2 {
    public void pX() {
        //System.out.println(x); //错误，原因不明确x
        //可以明确的指定x
        //访问接口的 x 就使用 A.x
        //访问父类的 x 就使用 super.x
        System.out.println(A2.x + " " + super.x);
    }

    public static void main(String[] args) {
        new C2().pX();
    }
}


