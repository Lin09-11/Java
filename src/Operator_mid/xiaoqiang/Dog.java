package Operator_mid.xiaoqiang;

/**
 * @author lin
 * @creat 2022--11--10 20:31
 */
public class Dog {

    public static void main(String[] args) {

        Dog dog = new Dog();//等价于 Dog dog=new package Operator_mid.xiaoqiang;
        System.out.println(dog);//Operator_mid.xiaoqiang.Dog@7ef20235

        Operator_mid.xiaoming.Dog dog1 =new Operator_mid.xiaoming.Dog();
        System.out.println(dog1);//Operator_mid.xiaoming.Dog@4f3f5b24
    }
}
