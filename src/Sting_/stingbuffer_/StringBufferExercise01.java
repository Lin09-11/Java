package Sting_.stingbuffer_;

/**
 * @author lin
 * @creat 2022--11--13:23
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;// ok
        StringBuffer sb = new StringBuffer(); //ok
//        底层将str设置为拥有“null”字符串
        sb.append(str);//需要看源码 , 底层调用的是 AbstractStringBuilder 的 appendNull
        System.out.println(sb.length());//4

        System.out.println(sb);//null
        //下面的构造器，会抛出NullpointerException--super(null.length() + 16)
        StringBuffer sb1 = new StringBuffer(str);//看底层源码 super(str.length() + 16);
        System.out.println(sb1);//报错

    }
}

