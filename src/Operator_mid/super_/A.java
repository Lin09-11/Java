package Operator_mid.super_;

import Operator_mid.extend_.impove_.Base;

/**
 * @author lin
 * @creat 2022--11--11 16:01
 */

public class A extends Base {
    //4个属性
    //public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public A() {}
    public A(String name) {}
    public A(String name, int age) {}

    public void cal() {
        System.out.println("A类的cal() 方法...");
    }

    public void test100() {
    }

    protected void test200() {
    }

    void test300() {
    }

    private void test400() {
    }
}


