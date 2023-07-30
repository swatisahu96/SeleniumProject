package InnerClass.SINC;

public class SINC {
    public static void main(String[] args) {

        new OP().display();
        OP.SINCDemo s = new OP.SINCDemo();
    }

}

class OP {
    static int o = 100;
    int r = 900;

    static class SINCDemo {
        // Static nested class can access static members
        //parent to child is accessible but reverse is not true
        void show() {
            System.out.println("I am show: " + o);
        }
    }

    static void display() {
        OP.SINCDemo sincDemo = new OP.SINCDemo();
        sincDemo.show();
    }

}