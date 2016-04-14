package Sorting;
import java.util.*;

/**
 * Created by quang on 4/4/16.
 */
public class InsertionSort {

    public void sort(int[] array){
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
    }


    public static void main(String args[]){
        int[] sampleArray ={1,4,3,2,6,5};
        InsertionSort machine = new InsertionSort();
        machine.sort(sampleArray);
        for(int a : sampleArray){
            System.out.print(a);
        }
    }
}