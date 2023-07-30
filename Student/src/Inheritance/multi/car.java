package Inheritance.multi;

public class car extends vehicle {

    car(int speed) {
        super(speed);
    }

    void topSpeed() {
        System.out.println("Top speed in Car");
    }

}
