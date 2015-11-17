package LinkedList;

/**
 * Created by Quang on 11/17/15.
 */
public class LinkedList {
    Node head;
    int size;

    public LinkedList(Node head, int size){
        this.head = head;
        this.size = size;
    }

    public void append(Node node){
        if(this.head == null){
            this.head = node;
        }else{
            Node cursor = this.head;
            while(cursor.next != null){
                cursor = cursor.next;
            }
            cursor.next = node;
        }
        this.size++;
    }
}
