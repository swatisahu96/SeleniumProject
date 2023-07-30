package Static;

public class RC {
    public static void main(String[] args) {

        AB ab= new AB();
        //AB a;// No static class executed
        //System.out.println(AB.b);
        System.out.println(ab.b);

    }
}

class AB{

    static int b=50;

    static {

        System.out.println("I am static block");
    }

    AB(){

        System.out.println("I am constructor");

    }
}

