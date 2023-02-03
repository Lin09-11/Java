package Operator_mid.extend_.impove_;

import Operator_mid.extend_.Graduate;

/**
 * @author lin
 * @creat 2022--11--10 22:55
 */

public class Extends01 {
    public static void main(String[] args) {
        Operator_mid.extend_.impove_.Pupil pupil = new Pupil();
        pupil.name = "银角大王~";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();

        System.out.println("=======");
        Operator_mid.extend_.Graduate graduate = new Graduate();
        graduate.name = "金角大王~";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}

