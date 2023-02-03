package Operator_mid.poly_.detail_;

/**
 * @author lin
 * @creat 2022--11--13:33
 */
public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof  BB);// true
        System.out.println(bb instanceof  AA);// true

        //aa 编译类型 AA, 运行类型是BB
        //BB是AA子类
//        instanceOf判断对象的运行类型
        AA aa = new BB();
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof BB);//true

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false
        String str = "hello";
        //System.out.println(str instanceof AA);//字符串跟AA没有关系
        System.out.println(str instanceof Object);//true
    }
}

class AA {} //父类
class BB extends AA {}//子类
