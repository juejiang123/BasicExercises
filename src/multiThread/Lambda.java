package multiThread;

public class Lambda {
    public static void main(String[] args) {
        new Thread(()->{
            for (int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

    }
}
