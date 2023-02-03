package Operator__senior.abstract_;

/**
 * @author lin
 * @creat 2022--11--21:06
 */
public class BB extends Template{

    public void job() {//这里也去，重写了Template的job方法

        long num = 0;
        for (long i = 1; i <= 80000; i++) {
            num *= i;
        }

    }
}

