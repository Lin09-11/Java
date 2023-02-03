package Exception.exception_;

/**
 * @author lin
 * @creat 2022--11--23:59
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "韩顺平教育";
        //将String 转成 int
        int num = Integer.parseInt(name);//抛出NumberFormatException
        System.out.println(num);//1234
    }
}

