package Operator__senior.static_;

/**
 * @author lin
 * @creat 2022--11--23:03
 */
public class StaticExercise02 {
}
class Person {  //StaticExercise02.java 2min 时间
    private int id;
    private static int total = 0;
    public static int getTotalPerson() {
//因为在静态方法中不可以调用普通变量
        //id++;//错误, 注销

        return total;
    }
    public Person() {//构造器
        total++;  //total = 1
        id = total;//id = 1
    }
}
class TestPerson {
    public static void main(String[] args) {
        System.out.println("Number of total is " +Person.getTotalPerson()); //0
        Person p1 = new Person();
        System.out.println( "Number of total is "+ Person.getTotalPerson()); //1
    }
}

