package MultiThreading;

public class Ex00 {
    public static void main(String[] args) {

        Thread t= Thread.currentThread();
        System.out.println("I am -> "+t);
        for(int i=0; i<5; i++){

            System.out.println(i+") "+"Name: "+t.getName()+ " Priority: "+t.getPriority());

        }


    }

}
