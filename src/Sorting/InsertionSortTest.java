package Sorting;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by quang on 4/11/16.
 */


/**
 * InsertionSortTest tests the sort method of InsertionSort class
 */
public class InsertionSortTest{
    InsertionSort sortMachine = new InsertionSort();
    @Before
    public void setUp() throws Exception{
        sortMachine = new InsertionSort();
    }
    @After
    public void tearDown(){
        sortMachine = null;
    }
    @Test
    public void testSort() throws Exception {
        int[] expected = {1,2,3,4,5};
        int[] sample = {3,1,2,5,4};
        sortMachine.sort(sample);
        assertArrayEquals(expected, sample);
    }

}