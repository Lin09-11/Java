package Operator_mid.houserent.utils;

/**
 * @author lin
 * @creat 2022--11--20:40
 */
public class TestUtility {

    public static void main(String[] args) {

//        这是一个测试类，使用完毕，就可以删除了
//          要求输入一个字符串，长度最大为3
//        String s = Utility.readString(3);
//        System.out.println("s="+s);

//        要求输入一个字符串，长度最大为10，如果用户直接回车，就给一个默认值
//        就把该方法当做一个api使用即可
        System.out.println("请输入字符串");
        String s2 = Utility.readString(10, "lin");
        System.out.println("s2="+s2);


       /** 这里直接使用，类.方法（）=> 因为当一个方法是static时候，就是一个静态方法
       注意：静态方法可以直接通过类名调用*/

       new A().hi();
        A.cry();//因为cry是静态方法，可以直接调用
    }
}

class  A{
    public void hi(){

    }

    public static void cry(){

    }
}
