package arraytest;

public class QueueTest {
    int[] array;
    int front;
    int rear;

    public QueueTest(int capacity){
        this.array=new int[capacity];
    }
    /*
    队列入队
     */
    public void enqueue(int element){
        if((rear+1)%array.length==front){
            System.out.println("这队列是满的");
        }
        array[rear]=element;
        rear=(rear+1)%array.length;
        System.out.println(array[rear]);
    }

    /*
    队列出队
     */
    public int dequeue(){
        if(rear==front){
            System.out.println("队列已空");
        }
        int dequeue= array[front];
        front=(front+1)%array.length;
        return dequeue;
    }

    public void output(){
        for (int i=front;i<rear;i=(i+1)%array.length){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){
        QueueTest queueTest = new QueueTest(2);
        queueTest.enqueue(1);
        queueTest.enqueue(2);
        queueTest.enqueue(3);
        queueTest.dequeue();
        queueTest.output();
    }
}
