package LinkedList;
import java.util.*;
/**
 * Created by Quang on 11/2/15.
 */

/*
 * Check palindrome number with EVEN length using only Stack
 * exp: 123321 is a palindrome number
 */
public class Palindrome {
    public static boolean isEven(int stringLength){
        if(stringLength % 2 != 0){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean checkPalindrome(int stringLength, StackNode stack){
        int i = 0;
        if(isEven(stringLength)){
            while(i < stringLength){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the number");
                int value = scanner.nextInt();
                Node n = new Node(value);
                stack.push(n);
                if(stack.peek().next != null) {
                    if (stack.peek().value == stack.peek().next.value) {
                        stack.pop();
                        stack.pop();
                    }
                }
                i++;
            }
            if(stack.isEmpty()){
                return true;
            }
        }else{
            System.out.println("The length of the number is not even");
            return false;
        }
        return false;
    }

    public static void main(String args[]){
        StackNode stack = new StackNode();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the number");
        int length = sc.nextInt();
        boolean result = checkPalindrome(length, stack);
        System.out.println(result);
    }
}

