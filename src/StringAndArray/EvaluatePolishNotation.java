package StringAndArray;

import java.util.*;
/**
 * 
 * @author Quang Vu
 * Date created: 10/21/15
 * Evaluate polish notation using StringAndArray.Stack
 *
 */
public class EvaluatePolishNotation {
   private Stack myStack;
   
   /*
    * Constructor
    */
   public EvaluatePolishNotation(Stack myStack){
      this.myStack = myStack;
   }
   
   /*
    * isInteger checks a string is integer or not
    * Return true or false
    */
   public boolean isInteger(String s){
      try{
         Integer.parseInt(s);
      }catch(NumberFormatException e){
         return false;
      }
      return true;
   }
   
   /*
    * Evaluate takes an polish equation/notation and compute the result
    */
   public int evaluate(String equation){
      String[] array = equation.split(" ");
      double result = 0;
      for(String s : array){
         // If the symbol is an integer -> push in the stack
         if(isInteger(s)){
            myStack.push(Double.valueOf(s));
         // If not -> has to be an operand 
         // pop 2 numbers from the stack and compute
         }else{
            double firstValue = (double) myStack.pop();
            double secondValue = (double) myStack.pop();
            if(s.equals("+")){
               result = Math.floor(firstValue + secondValue);
            }else if(s.equals("-")){
               result = Math.floor(firstValue - secondValue);
            }else if(s.equals("*")){
               result = Math.floor(firstValue * secondValue);
            }else{
               result = Math.floor(firstValue / secondValue);
            }
            myStack.push(result);
         }
      }
      return (int) result;
   }
   
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please type in the equation that you would like to solve:");
      String equation = scanner.nextLine();
      Stack s = new Stack();
      EvaluatePolishNotation lc = new EvaluatePolishNotation(s);
      int finalAnswer = lc.evaluate(equation);
      System.out.println(finalAnswer);
      scanner.close();
      
   }

}
