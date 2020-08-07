import java.util.Arrays;
import java.util.LinkedList;

public class BinaryTree {

    public static class TreeNode{
        int  data;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int data){
            this.data=data;
        }
    }

    public static TreeNode createBinaryTree(LinkedList<Integer> inputlist){
        TreeNode node=null;
        if(inputlist==null || inputlist.isEmpty()){
            return null;
        }
        Integer data = inputlist.removeFirst();
        if(data !=null){
            node=new TreeNode(data);
            node.leftChild=createBinaryTree(inputlist);
            node.rightChild=createBinaryTree(inputlist);
        }
        return node;
    }

    public static void preOrderTraveral(TreeNode node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        preOrderTraveral(node.leftChild);
        preOrderTraveral(node.rightChild);
    }

    public static void main(String[] args) {
        LinkedList<Integer> inputlist=new LinkedList<>(Arrays.asList(new Integer[]{3,2,5,null,10,null,8,null}));
        TreeNode node = createBinaryTree(inputlist);
        preOrderTraveral(node);

    }


}
