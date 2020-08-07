package multiThread;

public class RunnableImpl2 implements Runnable{

    private int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
            while (true){
                synchronized (obj){
                    if(ticket>0){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"正在卖票"+ticket);
                        ticket--;
                    }

            }
        }

    }
}
