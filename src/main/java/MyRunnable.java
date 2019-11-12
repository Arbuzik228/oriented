/**
 * Created by Admin on 30.10.2019.
 */
public class MyRunnable implements Runnable {
    public static void main(String[]args){
       MyRunnable m = new MyRunnable();
       MyRunnable b= new MyRunnable();
        new Thread(m).run();
       b.stop();
    }

    private  boolean active;

    @Override
    public void run() {
        active=true;
        while(active){
         System.out.println("This is my code");
        }

    }

   public void stop(){
       active=false;
       System.out.println("Stop");
   }


}
