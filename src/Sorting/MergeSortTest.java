package Sorting;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by quang on 4/14/16.
 */
public class MergeSortTest {
    MergeSort sortMachine = new MergeSort();
    /**
     * Test if two arrays are merged together. The result should be in correct order
     * Note: elements inside each arrays are ALWAYS in the right order
     * We want to test if the merge function can merge two arrays and still
     * keep the order correctly.
     * @throws Exception
     */
    @Test
    public void testMerge() throws Exception {
        int[] listOfNum = {1,4,6,2,3,5};
        ArrayList<Integer> sampleArr1 = new ArrayList<Integer>();
        ArrayList<Integer> sampleArr2 = new ArrayList<Integer>();
        ArrayList<Integer> mergeArr = new ArrayList<Integer>();
        ArrayList<Integer> expectedArr = new ArrayList<Integer>();
        for(int i =  0; i < listOfNum.length; i++){
            expectedArr.add(i+1);
            mergeArr.add(listOfNum[i]);
            if(i < listOfNum.length/2) {
                sampleArr1.add(listOfNum[i]);
            }else{
                sampleArr2.add(listOfNum[i]);
            }
        }
        sortMachine.merge(sampleArr1, sampleArr2, mergeArr);
        assertEquals(expectedArr, mergeArr);
    }

    /**
     * Test if the array is actually split in half
     * @throws Exception
     */
    @Test
    public void testMergeSort() throws Exception {

    }
}