package Sorting;
import java.util.*;
/**
 * Created by Quang on 11/2/15.
 */
public class MergeSort {
    /**
     * This function will compare each elements of the left and right arrays.
     * If one element is smaller, it will be added in the correct order of the
     * final array. Keep doing it until the end of the left or right array.
     * Finally, the function handle a possible scenario which is either the left
     * or right array exhausted first. In that case, we will have to add the
     * rest of the elements from the "not" exhausted array to the final array
     * @param left an unsorted left array
     * @param right an unsorted right array
     * @param bigArray a sorted array by merging the left and right arrays together
     * @return the sorted array (bigArray)
     */
    public void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> bigArray){
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
        // Search for the array that still have elements, add them to the final array
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
    }

    /**
     * This function will recursively split an unsorted array into half
     * until there is only one element left in the list. After that, it
     * will recursively merge and sort those splited array back to the
     * final array by calling the merge function
     * @param bigArray an array that we will split into half until
     *                 the there is only one element left in the list
     * @return the final sorted array
     */
    public void mergeSort(ArrayList<Integer> bigArray){
        int n = bigArray.size(); // length of big array
        // return the array if it contains only one or zero element
        // this is the base case for our recursive call too
        if( n < 2){
            return;
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
    }

    /**
     * Main function create a sample unsorted array and use the merge-sort
     * algorithm to sort the array
     * @param args empty argument list
     */
    public static void main(String args[]){
        Integer[] sample = {8,2,100,43,22,16,10,24};
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for(int i = 0; i < sample.length; i++){
            myArray.add(sample[i]);
        }

        System.out.println("Unsorted array: " + myArray);
        MergeSort mergeAlgorithm = new MergeSort();
        mergeAlgorithm.mergeSort(myArray);
        System.out.println("Sorted array: " + myArray);
    }
}
