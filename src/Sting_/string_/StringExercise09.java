package Sting_.string_;

/**
 * @author lin
 * @creat 2022--11--11:06
 */
public class StringExercise09 {
    public static void main(String[] args) {
        String s1 = "hspedu";  //s1 指向池中的 “hspedu”
        String s2 = "java"; // s2 指向池中的 “java”
        String s5 = "hspedujava"; //s5 指向池中的 “hspedujava”
        String s6 = (s1 + s2).intern();//s6 指向池中的   “hspedujava”
        System.out.println(s5 == s6); //T
//        toString方法重写了equals方法，equals方法就判断值是否相等
        System.out.println(s5.equals(s6));//T

    }
}

