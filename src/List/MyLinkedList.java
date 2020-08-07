package List;


public class MyLinkedList {
    private Node head;
    private Node last;
    private int size;

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public void insert(int data,int index){
        if(index>size || index<0){
            System.out.println("索引范围超出链表节点范围");
        }
        Node insertNode = new Node(data);
        if(size==0){
            head = insertNode;
            last = insertNode;
        }else if(index==size){
            last.next = insertNode;
            last = insertNode;
        }else {
            Node prevNode = get(index-1);
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;

        }
        size++;
    }

    public Node removeNode(int index){
        if(index<0 ||index>size){
            System.out.println("指针超出链表长度");
        }
        Node removeNode = null;
        if(index==0){
            removeNode=head;
            head=head.next;
        }else if(index==size-1){
            Node prevNode = get(index-1);
            removeNode = prevNode.next;
            prevNode.next = null;
        }else {
            Node prevNode = get(index-1);
            Node nextNode = prevNode.next.next;
            removeNode = prevNode.next;
            prevNode.next = nextNode;
        }
        size--;
        return removeNode;
    }

    public Node get(int index){
        if(index>size || index<0){
            System.out.println("超出链表节点范围");
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }

        return temp;
    }

    public void output(){
        Node temp = head;
        while (temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(3,0);
        list.insert(4,1);
        list.insert(5,2);
        list.insert(6,2);
        list.insert(7,1);
        list.removeNode(4);
        list.output();
        System.out.println("---------");
        System.out.println(list.size);

    }

}
