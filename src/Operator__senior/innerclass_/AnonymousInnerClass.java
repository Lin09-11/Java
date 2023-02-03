package Operator__senior.innerclass_;

/**
 * @author lin
 * @creat 2022--11--10:13
 */

/**
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 { //外部类
    private int n1 = 10;//属性
    public void method() {//方法
        //基于接口的匿名内部类
        //老韩解读
        //1.需求： 想使用IA接口,并创建对象
        //2.传统方式，是写一个类，实现该接口，并创建对象
        //3.老韩需求是 Tiger/Dog 类只是使用一次，后面再不使用
        //4. 可以使用匿名内部类来简化开发
        //5. tiger的编译类型 ? IA
        //6. tiger的运行类型 ? 就是匿名内部类  XXXX==Outer04$1
        /*
            我们看底层 会分配 类名 Outer04$1
            class Outer04$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("老虎叫唤...");
                }
            }
         */
        //7. jdk底层在创建匿名内部类 Outer04$1,立即马上就创建了 Outer04$1实例，并且把地址
        //   返回给 tiger
        //8. 匿名内部类使用一次，就不能再使用
        IA tiger = new IA() {//底层源码自己赋了一个类名给IA--class Outer04$1 implements IA {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };


        System.out.println("tiger的运行类型=" + tiger.getClass());//输出运行类名
        tiger.cry();
        tiger.cry();//说明cry可以反复调用
        tiger.cry();

//        IA tiger = new Tiger();
//        tiger.cry();



        //演示基于类的匿名内部类
        //分析
        //1. father编译类型 Father
        //2. father运行类型 Outer04$2   如果是Father father = new Father("jack")则运行类型是Father
        //3. 底层会创建匿名内部类
        /*
            class Outer04$2 extends Father{
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }
            }
         */
        //4. 同时也直接返回了 匿名内部类 Outer04$2的对象
        //5. 注意("jack") 参数列表会传递给 构造器
        Father father = new Father("jack"){

            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());//Outer04$2
        father.test();



        //基于抽象类的匿名内部类
        //编译类型是Animal
        //运行类型是   匿名内部类  Outer04$3
        Animal animal = new Animal(){//抽象内部类必须实现抽象类中的方法
            @Override
            void eat() {
                System.out.println("小狗吃骨头...");
            }
        };
        animal.eat();
    }
}

interface IA {//接口
    public void cry();
}
class Tiger implements IA {//实现该接口的时候，要将该接口中的所有方法都进行重写

    @Override
    public void cry() {
        System.out.println("老虎叫唤...");
    }
}

class Dog implements  IA{
    @Override
    public void cry() {
        System.out.println("小狗汪汪...");
    }
}

class Father {//类
    public Father(String name) {//构造器
        System.out.println("接收到name=" + name);
    }
    public void test() {//方法
    }
}

abstract class Animal { //抽象类
    abstract void eat();
}


