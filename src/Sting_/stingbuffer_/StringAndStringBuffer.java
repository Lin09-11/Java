package Sting_.stingbuffer_;

/**
 * @author lin
 * @creat 2022--11--13:04
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {

        //看 String——>StringBuffer
        String str = "hello tom";

        //方式1 使用构造器
        //注意： 返回的才是StringBuffer对象，对str 本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);

        //方式2 使用的是append方法，先创建一个空的StringBuffer对象，然后在将字符串传入这个对象最后调用append
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        //看看 StringBuffer ->String
        StringBuffer stringBuffer3 = new StringBuffer("韩顺平教育");

        //方式1 使用StringBuffer提供的 toString方法
        String s = stringBuffer3.toString();

        //方式2: 使用构造器来搞定
        String s1 = new String(stringBuffer3);

    }
}

