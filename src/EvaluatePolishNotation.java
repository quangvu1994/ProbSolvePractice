import java.util.*;

public class EvaluatePolishNotation {
   private Stack myStack;
   
   public EvaluatePolishNotation(Stack myStack){
      this.myStack = myStack;
   }
   
   public boolean isInteger(String s){
      try{
         Integer.parseInt(s);
      }catch(NumberFormatException e){
         return false;
      }
      return true;
   }
   
   public int evaluate(String equation){
      String[] array = equation.split(" ");
      double result = 0;
      for(String s : array){
         if(isInteger(s)){
            myStack.push(Double.valueOf(s));
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
