package Collection.linkedList;

public class NewLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        LinkedList list = new LinkedList();
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.list();
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
class LinkedList{
    Node head = new Node(0);
//    int size;

    public void addNode(Node node){
        Node temp = head;
        while(true){
            if(temp.next ==null){
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void list(){
        Node temp = head;
        while (true){
            if(temp.next == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
