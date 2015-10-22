import java.util.*;

public class QueueNode {
   Node first, last;
   
   public void enqueue(Node n){
      if(n != null){
         n.next = first;
         first = n;
      }
   }
   
   public Node dequeue(){
      return last;
   }
}
