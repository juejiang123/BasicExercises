package Collection.linkedList;
/*
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-two-numbers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LinkedTest {

    public class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }

    public ListNode addTwoNumbers(ListNode node1,ListNode node2){
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry =0;
        while (node1 !=null || node2 !=null || carry !=0){
            int n1Val = node1 != null ? node1.data:0;
            int n2Val = node2 != null ? node2.data:0;
            int sumVal = n1Val+n2Val+carry;
            carry = sumVal /10;
            ListNode sumNode = new ListNode(sumVal %10);
            cursor.next = sumNode;
            cursor =sumNode;
            if(node1 !=null) node1 = node1.next;
            if(node2 !=null) node2 = node2.next;
        }
        return root.next;
    }

    public static void main(String[] args) {

    }
}
