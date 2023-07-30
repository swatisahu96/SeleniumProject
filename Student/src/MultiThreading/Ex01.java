package MultiThreading;

public class Ex01 {

    public static void main(String[] args) {

        ThreadGroup th = new ThreadGroup("Worker");

        worker01 w1 = new worker01(th,"w1");
        worker01 w2 = new worker01(th,"w2");

        w1.start();
        w2.start();

        for (int i = 0; i < 10; i++) {

            try{
                System.out.println("Thread-"+Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }


    }
}

class worker01 extends Thread  {

    worker01(ThreadGroup thgroup, String name){
        super(thgroup, name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            try{
                System.out.println(Thread.currentThread().getName());
                sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}

