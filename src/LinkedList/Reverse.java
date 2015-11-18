package LinkedList;

import java.util.*;

/**
 * Created by Quang on 11/17/15.
 */

/**
 * Reverse a linked list using iterative way
 */
public class Reverse {
    public LinkedList reverse(LinkedList list){
        Node cursor = list.head;
        return list;
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
        machine.reverse(list);
    }
}
