package Object;

/**
 * @author lin
 * @creat 2022--11--09 19:30
 */

public class Object03 {

    //编写一个main方法
    public static void main(String[] args) {

        Person3 p1=new Person3();
        p1.age=10;
        p1.name="小明";
        Person3 p2=p1; //把p1 赋给了 p2 ， 让p2指向p1
        System.out.println(p2.age); // 10




    }
}

class Person3 {
    String name;
    int age;
}
