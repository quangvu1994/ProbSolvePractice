package Sorting;
import java.util.*;
/**
 * Created by Quang on 11/2/15.
 */
public class MergeSort {

    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> bigArray){
        int nL = left.size(); // length of left array
        int nR = right.size(); // length of right array
        int i = 0; // mark the unpicked in left array
        int j = 0; // mark the unpicked in right array
        int k = 0; // position in the big array

        // Compare each elements of the left array to the right array
        while( i < nL && j < nR){
            // element in the left smaller -> add that into the big array
            // increment the marker in the left array by one
            if(left.get(i) < right.get(j)){
                bigArray.set(k, left.get(i));
                i++;
            }else{
                bigArray.set(k, right.get(j));
                j++;
            }
            k++;
        }
        // handling the part when one of the left/right array is exhausted first
        while(i < nL){
            bigArray.set(k, left.get(i));
            i++;
            k++;
        }
        while(j < nR){
            bigArray.set(k, right.get(j));
            j++;
            k++;
        }

        return bigArray;
    }

    public ArrayList<Integer> mergeSort(ArrayList<Integer> bigArray){
        int n = bigArray.size(); // length of big array
        // return the array if it contains only one or zero element
        // this is the base case for our recursive call too
        if( n < 2){
            return null;
        }

        int mid = n/2;
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        for(int i = 0; i < mid; i++){
            left.add(bigArray.get(i));
        }

        for(int i = mid; i < n; i++){
            right.add(bigArray.get(i));
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right, bigArray);

        return bigArray;
    }

    public static void main(String args[]){
        Integer[] sample = {2,1,4,6,10,8,3,7,5,9};
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for(int i = 0; i < sample.length; i++){
            myArray.add(sample[i]);
        }


        MergeSort mergeAlgorithm = new MergeSort();
        System.out.println(mergeAlgorithm.mergeSort(myArray));
    }
}
