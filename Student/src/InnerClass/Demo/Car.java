package InnerClass.Demo;

public class Car {

    int year;
    public Car(int year){
        this.year= year;
    }
    void drive(){
        System.out.println("I can drive");
        new Engine(500).start();// This is when you like in real life have no idea about inner
        // class in main method
    }
    class Engine{

        int horsePower;
        public Engine(int horsePower){
            this.horsePower=horsePower;
        }
        void start(){
            System.out.println("I am starting the engine");
        }

    }

}
