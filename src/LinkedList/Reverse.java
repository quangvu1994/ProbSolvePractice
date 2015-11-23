package LinkedList;

import java.util.*;

/**
 * Created by Quang on 11/17/15.
 */

/**
 * Reverse a linked list using iterative way
 */
public class Reverse {

    public Node reverse(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node endMarker = head;
        Node headMarker = head;
        while(endMarker.next != null){
            Node temp = endMarker.next.next;
            head = endMarker.next;
            head.next = headMarker;
            headMarker = head;
            endMarker.next = temp;
        }

        return head;
    }

    public static void main (String args[]){
        LinkedList list = new LinkedList(null, 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of node(s) for the Linked list :");

        int len = scanner.nextInt();
        for(int i = 0; i < len; i++){
            Node node = new Node(i);
            list.append(node);
        }

        Reverse machine = new Reverse();
        Node newHead = machine.reverse(list.head);

        GetElement printer = new GetElement();
        printer.printList(newHead);
    }
}
