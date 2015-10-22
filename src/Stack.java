import java.util.*;

public class Stack implements StackInterface {
   private LinkedList<Object> list = new LinkedList<Object>();
   
   @Override
   public void push(Object obj) {
      list.addFirst(obj);
   }

   @Override
   public Object pop() {
      return list.removeFirst();
   }

   @Override
   public Object peek() {
      return list.getFirst();
   }

   @Override
   public int size() {
      return list.size();
   }

   @Override
   public boolean isEmpty() {
      return list.isEmpty();
   }

}
