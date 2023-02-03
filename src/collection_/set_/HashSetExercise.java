package collection_.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author lin
 * @creat 2022--11--15:12
 */
@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {


        /**
         定义一个Employee类，该类包含：private成员属性name,age 要求:
         创建3个Employee 对象放入 HashSet中
         当 name和age的值相同时，认为是相同员工, 不能添加到HashSet集合中

         */
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("milan", 18));//ok
        hashSet.add(new Employee("smith", 28));//ok
        hashSet.add(new Employee("milan", 18));//如果不重写equals()和hashCode，则加入成功.

        //回答,加入了几个? 3个
//        先判断hash(),在判断equals()
       /*
        1.先获取元素的哈希值（hashCode）方法
        2.对哈希值进行运算，得出一个索引值即为存放在哈希表中的位置号
        3.如果该位置上没有其他元素，则值直接存放
        4.如果该位置上一个有其他元素，则需要进行equals判断，如果相等，则不添加，如果不相等，则以链表的方式添加
        */
        System.out.println("hashSet=" + hashSet);
    }
}

//创建Employee
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
    //如果name 和 age 值相同，则返回相同的hash值


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}


