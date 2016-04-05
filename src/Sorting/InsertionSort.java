package Sorting;
import java.util.*;

/**
 * Created by quang on 4/4/16.
 */
public class InsertionSort {

    public int[] sort(int[] array){
        int temp;
        for(int i = 1; i < array.length; i++){
            for(int j = i; j > 0; j--){
                // Swap with the smaller number
                if(array[j] <  array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                else{
                    break; //Skip unnecessary loop
                }
            }
        }

        return array;
    }


    public static void main(String args[]){
        int[] sampleArray ={1,4,3,2,6,5};
        InsertionSort machine = new InsertionSort();
        int[] sortedArray = machine.sort(sampleArray);
        for(int a : sortedArray){
            System.out.print(a);
        }
    }
}