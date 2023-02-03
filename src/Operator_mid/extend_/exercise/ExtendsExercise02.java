package Operator_mid.extend_.exercise;

/**
 * @author lin
 * @creat 2022--11--11 15:38
 */
public class ExtendsExercise02 {
    public static void main(String[] args) {
        C1 c = new C1();
    }
}

class A1 {//A类

    public A1() {
//        super();//Object类的
        System.out.println("我是A类");
    }
}

class B1 extends A1 { //B1类,继承A1类		//main方法中： C c =new C(); 输出么内容? 3min
    public B1() {
        System.out.println("我是B类的无参构造");
    }

    public B1(String name) {
//        记得，默认调用了B父类的无参构造器
//        super();---public A1()
        System.out.println(name + "我是B类的有参构造");
    }
}

class C1 extends B1 {   //C1类，继承 B1类
    public C1() {
        this("hello");//调用本类的有参构造器--public C1(String name)
        System.out.println("我是c类的无参构造");
    }

    public C1(String name) {
        super("hahah");//调用直接父类的有参构造器----public B1(String name)
        System.out.println("我是c类的有参构造");
    }
}


