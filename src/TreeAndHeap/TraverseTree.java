package TreeAndHeap;
import java.util.*;

/**
 * Created by Quang on 11/2/15.
 * Recursively traverse through a sample tree in-order, pre-order, and post-order
 */
public class TraverseTree {
    private ArrayList<Integer> iOrder = new ArrayList<Integer>();
    private ArrayList<Integer> preOrd = new ArrayList<Integer>();
    private ArrayList<Integer> postOrd = new ArrayList<Integer>();

    /*
     * Recursive in-order
     */
    public ArrayList<Integer> inOrder(TreeNode root){
        if (root != null) {
            inOrder(root.left);
            iOrder.add(root.value);
            inOrder(root.right);
        }

        return iOrder;
    }

    public ArrayList<Integer> preOrder(TreeNode root){
        if (root != null){
            preOrd.add(root.value);
            preOrder(root.left);
            preOrder(root.right);
        }

        return preOrd;
    }

    public ArrayList<Integer> postOrder(TreeNode root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            postOrd.add(root.value);
        }

        return postOrd;
    }
    public static void main(String args[]){
        TraverseTree tTree = new TraverseTree();

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
