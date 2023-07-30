package Exception.Practice;

public class Exp04 {
    public static void main(String[] args) {

        try{
            int r= divide(10,0);
            System.out.println("Result is: "+r);
        }catch (Exception e){
            //e.printStackTrace();
            //we won't use it here
            System.out.println(e.getMessage());
        }

    }
    static int divide(int a , int b){

        if(b==0){

            throw new ArithmeticException("Divide by zero is not possible");
            //If we don't throw it then JVM will throw the object but using throw we can give
            //personalized message.
            // Here throw is used because a specific condition is met.
        }
        int r= a/b;
        return r;

    }

}
