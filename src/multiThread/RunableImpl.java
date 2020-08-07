package multiThread;

public class RunableImpl implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("卖票"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread.currentThread().getName();

    }
}
