package Sting_.stringTest;

/**
 * @author lin
 * @creat 2022--11--21:14
 */
public class Homework05 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);//true
//        Animal类的equals方法没有被重写，则equals还是判断是否指向同一个对象
        System.out.println(a.equals(b));//false
        System.out.println(a.name == b.name);//true
        String s4 = new String("hspedu");
        String s5 = "hspedu";

//        s1---指向常量池中的，s4---指向堆中的
        System.out.println(s1 == s4);//false
//        s5---指向常量池中的，s4---指向堆中的
        System.out.println(s4 == s5);

//        如果是有变量，则是创建一个StringBuilder，然后appned
//        在堆中创建一个新的对象，然后在指向常量池中
        String t1 = "hello" + s1;
//        t2是在常量池中
        String t2 = "hellohspedu";
        System.out.println(t1==t2);//false
//        t1.intern()---返回的是t1在常量池中的位置
        System.out.println(t1.intern() == t2);//true


    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

