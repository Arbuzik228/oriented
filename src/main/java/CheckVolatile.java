/**
 * Created by Admin on 04.11.2019.
 */
public class CheckVolatile {
    static volatile int a = 0;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread started...");
        System.out.println("Main thread  a = " + CheckVolatile.a);
        new JThread("Other thread").start();
        Thread.sleep(5000);
        System.out.println("Main thread a = " + CheckVolatile.a);
        System.out.println("Main thread finished...");


    }

}

class JThread extends Thread {

    JThread(String name) {
        super(name);
    }

    public void run() {

        System.out.printf("other %s", CheckVolatile.a);
        //System.out.println("other " + CheckVolatile.a);
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        CheckVolatile.a = 1000;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("other  a = %s", CheckVolatile.a);
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}