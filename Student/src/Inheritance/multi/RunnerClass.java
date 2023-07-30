package Inheritance.multi;

import Inheritance.single.Java;


public class RunnerClass {

    public static void main(String[] args) {

        tesla t = new tesla(100);
        t.topSpeed();

        car c = new car(100);
        c.topSpeed();

        vehicle v = new vehicle(100);
        v.topSpeed();

        new tesla(20).topSpeed();


    }

}
