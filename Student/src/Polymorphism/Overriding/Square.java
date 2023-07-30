package Polymorphism.Overriding;

public class Square extends Shape{

    private int a;

    Square(int a) {
    this.a=a;
    }

    public double getArea(){
        System.out.println("Square area called");
        return a*a;
    }


}
