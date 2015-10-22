import java.util.*;

/**
 * 
 * @author Quang Vu
 * Purpose: the solver rotate an array of n-elements at k-steps
 * EXP: n = 7, k = 3
 * [1,2,3,4,5,6,7] ---------> [5,6,7,1,2,3,4]
 *
 */
public class Solver {

   public static void main(String[] args) {
     // Read in user input and initialize the original array
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter the number of an array:");
     int n = scanner.nextInt();
     System.out.println("Please enter the number of steps:");
     int k = scanner.nextInt();
     
     int[] originalArray = new int[n];
     int num = 1;
     for(int i = 0; i < originalArray.length; i++){
        originalArray[i] = num;
        num++;
     }
     
     /*
      * Rotating mechanism:
      * Add element at index (k+1) from the original array to the rotated array
      * and increment k until k is not bigger than the original array's length
      * 
      * Add the rest to the rotated array from index 0 of original array
      */
     int[] rotatedArray = new int[n];
     int index = 0;
     k++;
     for(int j = 0; j < originalArray.length; j++){
        if(!(k >= originalArray.length)){
           rotatedArray[j] = originalArray[k];
           k++;
        }
        else{
           rotatedArray[j] = originalArray[index];
           index++;
        }
     }
     System.out.println(Arrays.toString(rotatedArray));
   }

}
