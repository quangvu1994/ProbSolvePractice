package Sorting;
import java.util.*;
/**
 * Created by Quang on 11/2/15.
 */
public class SelectionSort {

    public void sort(int[] input){
        int min;
        for(int i = 0; i < input.length; i++){
            min = i;
            for(int j = i+1; j < input.length; j++){
                if(input[j] < input[min]){
                    min = j;
                }
            }
            if(min != i){
                int tempt = input[i];
                input[i] = input[min];
                input[min] = tempt;
            }
        }
    }
    public static void main(String args[]){
        int[] sampleArray = {4,2,6,3,7,1,5};
        SelectionSort sortMachine = new SelectionSort();
        sortMachine.sort(sampleArray);
        for(int a : sampleArray){
            System.out.println(a);
        }
    }
}
