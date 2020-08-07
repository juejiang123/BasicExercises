package multiThread;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        MyThread mt = new MyThread();
//        MyThread mt1 = new MyThread();
//        mt.start();
//        mt1.start();
        RunableImpl run = new RunableImpl();
        Thread td = new Thread(run);
        td.start();

//        new Thread(){
//            @Override
//            public void run(){
//                for(int i=1;i<20;i++){
//                    System.out.println("einelgwe");
//                }
//            }
//        }.start();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(1111);
            }
        };
        new Thread(r).start();
    }
}
