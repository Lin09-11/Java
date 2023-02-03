package Operator__senior.codeblock_;

/**
 * @author lin
 * @creat 2022--11--12:58
 */
public class CodeBlockExercise01 {
}
class Person {
    public static int total;//静态变量
    static {//静态代码块
        total = 100;
        System.out.println("in static block!");//(1)
    }
}

class Test {
    public static void main(String[] args) {
//        当直接使用类调用属性的时候，类会被直接加载，而且就加载一次
        System.out.println("total = "+ Person.total); //100
        System.out.println("total = "+ Person.total); //100
    }
}

