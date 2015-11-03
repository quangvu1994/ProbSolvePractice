package TreeAndHeap;
import StringAndArray.Stack;

import java.util.ArrayList;

/**
 * Created by Quang on 11/2/15.
 */
public class TraverseTreeStack {
    private Stack myStack = new Stack();
    private ArrayList<Integer> iOrder = new ArrayList<Integer>();
    private ArrayList<Integer> preOrd = new ArrayList<Integer>();
    private ArrayList<Integer> postOrd = new ArrayList<Integer>();

    public ArrayList<Integer> inOrder(TreeNode node){
        while(!myStack.isEmpty() || node != null){
            if(node != null) {
                myStack.push(node);
                node = node.left;
            }else{
                node = (TreeNode) myStack.pop();
                iOrder.add(node.value);
                node = node.right;
            }
        }
        return iOrder;
    }

    public ArrayList<Integer> preOrder(TreeNode node){
        while(!myStack.isEmpty() || node != null){
            if(node != null){
                preOrd.add(node.value);
                if(node.right != null){
                    myStack.push(node.right);
                }
                node = node.left;
            }else{
                node = (TreeNode) myStack.pop();
            }
        }
        return preOrd;
    }

    public ArrayList<Integer> postOrder(TreeNode node){
        while(!myStack.isEmpty() || node != null){

        }
        return null;
    }

    public static void main(String args[]){
        TraverseTreeStack tTree = new TraverseTreeStack();

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n3.left = n2;
        n3.right = n4;
        n4.right = n5;
        n5.left = null;
        n5.right = null;
        n2.left = n1;
        n2.right = null;
        n1.left = null;
        n1.right =null;

        System.out.println("Inorder: " + tTree.inOrder(n3) +"\n");
        System.out.println("Preorder: " + tTree.preOrder(n3) + "\n");
        System.out.println("Postorder: " + tTree.postOrder(n3) + "\n");
    }
}
