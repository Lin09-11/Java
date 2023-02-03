package Operator_mid.extend_.exercise;

/**
 * @author lin
 * @creat 2022--11--11 15:32
 */
public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b=new B();//a , b name, b
    }
}

class A {
    A() {
        System.out.println("a");
    }

    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
//        this和super不能同在一个构造器中
        this("abc");//在进入这里的时候，跳转到B(String name)的构造器中，继续
        System.out.println("b");
    }

    B(String name) {
        //默认有 super();--调用A的空参构造器
        System.out.println("b name");
    }
}


