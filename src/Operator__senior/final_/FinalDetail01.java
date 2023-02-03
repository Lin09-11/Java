package Operator__senior.final_;

/**
 * @author lin
 * @creat 2022--11--20:29
 */

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();

        new EE().cal();
    }
}

class AA {
    /*
    1. 定义时：如 public final double TAX_RATE=0.08;--一定要赋值，因为是常量
    2. 可以在构造器中给final修饰的变量赋值
    3. 可以在代码块中给final修饰的变量赋值
     */
    public final double TAX_RATE = 0.08;//1.定义时赋值
    public final double TAX_RATE2 ;
    public final double TAX_RATE3 ;

    public AA() {//构造器中赋值
        TAX_RATE2 = 1.1;
    }
    {//在代码块赋值
        TAX_RATE3 = 8.8;
    }
}

class BB {
    /*
    如果final修饰的属性是静态的，则初始化的位置只能是
    1 定义时  2 在静态代码块
    3.不能在构造器中赋值。--（因为构造器要在创建对象的时候才会被触发，但是静态变量的初始化是在类加载的时候就触发了）
     */
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2 ;

    static {
        TAX_RATE2 = 3.3;
    }


}

//final类不能继承，但是可以实例化对象
final class CC { }


//如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承
//即，仍然遵守继承的机制.
class DD {
    public final void cal() {
        System.out.println("cal()方法");
    }
}
class EE extends DD { }
