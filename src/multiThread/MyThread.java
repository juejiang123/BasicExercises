package multiThread;

public class MyThread extends Thread {

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName());
    }
}
