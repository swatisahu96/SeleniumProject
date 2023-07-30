package MultiThreading.Synchronization;

public class SyncDemo01 {

    public static void main(String[] args) throws Exception{
        Sync s1 = new Sync();
        A ta= new A(s1, "A" );
        ta.start();

        Sync s2 = new Sync();
        B tb= new B(s2, "B" );
        tb.start();

    }

}

class A extends Thread {
    Sync s;
    A(Sync s, String tname){
        super(tname);
        this.s=s;
    }

    public void run(){
        s.m1();
    }
}

class B extends Thread {
    Sync s;
    B(Sync s, String tname){
        super(tname);
        this.s=s;
    }
    public void run(){
        s.m1();
    }
}


class Sync {

    void m1() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 5; i++) {

            System.out.println(t.getName() + "-m1-" + i);
            try {
                Thread.sleep(2000);
            }catch(Exception e){

            }
        }
    }

    void m2() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(t.getName() + "-m2-" + i);
            try {
                Thread.sleep(2000);
            }catch(Exception e){

            }
        }
    }
}
