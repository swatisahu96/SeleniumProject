package Polymorphism.Overriding;

public class Circle extends Shape{
    double r;
    Circle(double r){

        this.r=r;
    }

    public double getArea(){
        System.out.println("Circle Area Called");
        return 3.14*r*r;
    }
}