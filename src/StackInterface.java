/**
 * 
 * @author Quang Vu
 * Date created: 10/20/15
 * A simple stack interface
 *
 */
public interface StackInterface {
   /*
    * Push an object into the stack
    */
   void push(Object obj);
   /*
    * Pop an object on top from the stack
    */
   Object pop();
   /*
    * Peek the top object on the stack
    */
   Object peek();
   /*
    * Get the size of the stack
    */
   int size();
   /*
    * Check whether the stack is empty or not
    */
   boolean isEmpty();
   
}
