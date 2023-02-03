package Object;

/**
 * @author lin
 * @creat 2022--11--10 20:06
 */

public class Homework10 {

    //编写一个main方法
    public static void main(String[] args) {
    }
}

class Demo{
    int i=100;
    public void m(){
        int j=i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}
class Test5{
    public static void main(String[] args){//运行它
        Demo d1=new Demo();
        Demo d2 = d1;
        d2.m();
        System.out.println(d1.i);
        System.out.println(d2.i);
//        输出 101 100 101 101
    }
}

