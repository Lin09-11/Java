package Operator_mid.extend_.impove_;

/**
 * @author lin
 * @creat 2022--11--10 22:50
 */
//父类,是Pupil 和 Graduate的父类
public class Student {
    //共有属性
    public String name;
    public int age;
    private double score;//成绩
    //共有的方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}

