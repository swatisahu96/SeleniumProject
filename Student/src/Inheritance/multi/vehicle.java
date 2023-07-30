package Inheritance.multi;

public class vehicle {

    int seats;
    String engineType;
    int speed;

    vehicle(int speed){
    this.speed= speed;
    }

    void topSpeed(){

        System.out.println("Top speed is:"+this.speed);
    }




}
