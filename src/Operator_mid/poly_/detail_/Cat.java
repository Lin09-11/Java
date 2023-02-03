package Operator_mid.poly_.detail_;

/**
 * @author lin
 * @creat 2022--11--13:32
 */
public class Cat extends Animal {
    public void eat(){//方法重写
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){//Cat特有方法
        System.out.println("猫抓老鼠");
    }
}

