package Sorting;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by quang on 4/11/16.
 */


/**
 * InsertionSortTest tests the sort method of InsertionSort class
 */
public class InsertionSortTest{
    @Test
        public void testSort() throws Exception {
            InsertionSort sortMachine = new InsertionSort();
            int[] expected = {1,2,3,4,5};
            int[] sample = {3,1,2,5,4};
            sortMachine.sort(sample);
            assertArrayEquals(expected, sample);
    }

}