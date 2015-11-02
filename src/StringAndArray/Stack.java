package StringAndArray;

import java.util.*;
/**
 * 
 * @author Quang Vu
 * Date created: 10/21/15
 * StringAndArray.Stack structure using LinkedList
 *
 */
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
