package Exception.Practice;

public class Exception01 {

    public static void main(String[] args) {

        extracted2();
    }

    public static void extracted2(){
        extracted1();
        System.out.println("Extracted2");
    }

    public static void extracted1(){
        extracted();
        System.out.println("Extracted1");
    }

    public static void extracted() {


        try {
            String s = null;
            s.length();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
