
public class StackNode {
   Node topNode;

   public void push(Node node){
      if(node != null){
         node.next = topNode;
         topNode = node;
      }
   }
   
   public Node peek(){
      if(topNode != null){
         return topNode;
      }
      return null;
   }
   
   public Node pop(){
      if(topNode == null){
         return null;
      }
      Node temp = new Node(topNode.value);
      topNode = topNode.next;
      return temp;
   }
   public boolean isEmpty(){
      if(topNode == null){
         return true;
      }
      return false;
   }
   
}
