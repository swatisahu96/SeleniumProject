package InnerClass.Demo;

public class RC {

    public static void main(String[] args) {

        Car c= new Car(2020);
        c.drive();
        Car.Engine carEngine= c.new Engine(500);
        carEngine.start();
        //OR Simply
        //Car c= new Car(2020);
        //  c.drive(); // when you have no idea about engine and engine class is totally isolated

        //Class hidden within class



    }
}
