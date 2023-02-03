package Exception.homework;

/**
 * @author lin
 * @creat 2022--12--18:36
 */
public class test {
    public static void main(String[] args) {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        Object o2;
        if (true) {
            o2 = new Integer(1);
        } else {
            o2 = new Double(2.0);
        }
        System.out.print(o1);//1
        System.out.print(" ");
        System.out.print(o2);//1
    }
}
