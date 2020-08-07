package multiThread;

public class TestRun {
    public static void main(String[] args) {
        RunnableImpl2 run = new RunnableImpl2();
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
    }
}
