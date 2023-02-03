package Operator_mid.object;

/**
 * @author lin
 * @creat 2022--11--22:50
 */
public class EqualsExercise02 {
    public static void main(String[] args) {

        Person_ p1 = new Person_();
        p1.name = "hspedu";

        Person_ p2 = new Person_();
        p2.name = "hspedu";

//        ==---p1和p2是字符串，则==判断的是字符串是否相等
        System.out.println(p1==p2); //False
//        name是字符串，String类的equals方法，已经被重写了，则equals方法判断的是值是否相等
        System.out.println(p1.name .equals( p2.name));//T
//        p1是一个Person类，所以Object，类型并没有被重写，则Object的equals方法，依然是判断地址值是否相同
        System.out.println(p1.equals(p2));//False

        String s1 = new String("asdf");

        String s2 = new String("asdf");
//        name是字符串，String类的equals方法，已经被重写了，则equals方法判断的是值是否相等
        System.out.println(s1.equals(s2));//T
//        s1和s2不是同一个对象
        System.out.println(s1==s2); //F

    }
}

class Person_{//类
    public String name;
}

