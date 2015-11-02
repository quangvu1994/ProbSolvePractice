package LinkedList;

/**
 * Created by Quang on 11/2/15.
 */

/*
 * GetElement prints out all elements of the LinkedList
 * and get an element from a specific position
 */
public class GetElement {

    public static Node getElement(int index, Node n) {
        // Initialize a count
        int count = 0;
        while (n != null) {
            // If the count is the same as the index, return the node
            if(count == index){
                return n;
            }
            // Move on to next node and increment count
            n = n.next;
            count++;
        }
        return null;
    }

    public static void printList(Node n){
        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }
    }

    public static void main(String args[]){
        // Initialize a simple LinkedList
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        printList(n1);
        Node found = getElement(1, n1);
        System.out.println("\n"+found.value);
    }
}
