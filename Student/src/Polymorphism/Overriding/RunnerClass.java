package Polymorphism.Overriding;

import Inheritance.single.Java;

public class RunnerClass {

    public static void main(String[] args) {

        Shape sh = new Shape();
        sh.getArea();

        Shape sq = new Square(10);
        double sqArea = sq.getArea();
        System.out.println(sqArea);

        Shape c = new Circle(2);
        double circleArea = c.getArea();
        System.out.println(circleArea);

        Shape shArray[]= new Shape[5];
        shArray[0]= new Square(20);
        shArray[1]= new Circle(5);

        System.out.println("shArray[0]:"+shArray[0].getArea());
        System.out.println(new Shape().getArea());
        System.out.println( );



    }

}
