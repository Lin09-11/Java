package Operator_mid.poly_.detail_;

/**
 * @author lin
 * @creat 2022--11--13:32
 */
public class PolyDetail {
    public static void main(String[] args) {

        //向上转型: 父类的引用指向了子类的对象
        //语法：父类类型引用名 = new 子类类型();
        Animal animal = new Cat();
        Object obj = new Cat();//可以吗? 可以 Object 也是 Cat的父类

        //向上转型调用方法的规则如下:
        //(1)可以调用父类中的所有成员(需遵守访问权限)
        //(2)但是不能调用子类的特有的成员
        //(3)因为在编译阶段，能调用哪些成员,是由编译类型来决定的

//        在编译时看编译类型（Animal),但是Animal中没有catchMouse()这个方法，所以编译不通过
        //animal.catchMouse();错误
        //(4)最终运行效果看子类(运行类型)的具体实现, 即调用方法时，按照从子类(运行类型)开始查找方法
        //，然后调用，规则我前面我们讲的方法调用规则一致。

//        为什么编译可以通过？？
//        因为编译类型为Animal，然后Animal中有eat类(如果此时Animal类中没有eat类型，则编译失败），
//        （因为此时Animal类中有eat类）所以编译通过。进入运行类型（Cat),此时Cat中的eat是猫吃鱼
        animal.eat();//猫吃鱼..

//        此时Animal中有run,所以此时编译通过。（先到子类中找，如果找不到则到父类中找）
//        但是Cat类中没有run方法，所以调用的是Animal中的run方法
        animal.run();//跑
        animal.show();//hello,你好
        animal.sleep();//睡

        //老师希望，可以调用Cat的 catchMouse方法
        //多态的向下转型
        //(1)语法：子类类型 引用名 =（子类类型）父类引用;
        //问一个问题? cat 的编译类型 Cat,运行类型是 Cat
        Cat cat = (Cat) animal;
        cat.catchMouse();//猫抓老鼠
        //(2)要求父类的引用必须指向的是当前目标类型的对象
//        原来Animal animal=new Cat();
        Dog dog = (Dog) animal; //可以吗？---不可以，因为原来是Cat

        System.out.println("ok~~");
    }
}

