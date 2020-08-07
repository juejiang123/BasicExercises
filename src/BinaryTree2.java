import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/*
用栈遍历二叉树
 */
public class BinaryTree2 {

    static class TreeNode{
        int data;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public static TreeNode createBinaryTree(LinkedList<Integer> linkedList){
        TreeNode node =null;
        if(linkedList ==null || linkedList.isEmpty()){
            return null;
        }
        Integer data = linkedList.removeFirst();
        if(data != null){
            node = new TreeNode(data);
            node.leftNode = createBinaryTree(linkedList);
            node.rightNode = createBinaryTree(linkedList);
        }
        return node;
    }

    public static void preOrderTraveralWithStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || ! stack.isEmpty()){
            while (node != null){
                System.out.println(node.data);
                stack.push(node);
                node = node.leftNode;
            }
            if(! stack.isEmpty()){
                node = stack.pop();
                node = node.rightNode;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(new Integer[]{3,2,9,null,3,2,null,null,5,8}));
        TreeNode tree = createBinaryTree(linkedList);
        preOrderTraveralWithStack(tree);
    }
}
