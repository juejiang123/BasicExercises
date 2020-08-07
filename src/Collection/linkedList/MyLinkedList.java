package Collection.linkedList;
/*
下面是对这种链表的 头插、尾插和按照指定位置插入
 */
public class MyLinkedList {
    static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            Node next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    private Node head;
    private int size;
    public MyLinkedList(){
        this.head = null;
    }

    //头插法
    public void addFirst(int data){
        Node node= new Node(data);
        if(head == null){
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }

    //尾插法
    public void addTail(int data){
        Node node = new Node(data);
        Node temp = head;
        if(head == null){
            head = node;
        }else {
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public int getlength(){
        int size=0;
        if(head == null){
            System.out.println("空链表");
        }else {
            Node temp = head;

            while (true){
                if(temp.next ==null){
                    break;
                }else {
                    size++;
                    temp = temp.next;

                }

            }
            size++;
            System.out.println(size);
        }
        return size;

    }
    //查找index
    private Node search(int index){

        if(index<0 || index> getlength()){
            System.out.println("index超出范围");
            throw new IndexOutOfBoundsException("超出链表范围");
        }
        int count =0;
        Node cur = this.head;
        for(int i=0;i<index-1;i++){
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //任意位置插入
    public void addIndex(int index,int data){
        Node node = new Node(data);
        if(index==0){
            addFirst(data);

        }
        Node cur = search(index);
        node.next = cur.next;
        cur.next = node;
    }

    public void list(){
        if(head == null){
            System.out.println("空链表");
        }else {
            Node temp = head;
            while (temp.next == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addTail(5);
        list.addTail(6);
        list.addTail(7);
        list.addIndex(4,9);
        list.list();
    }
}
