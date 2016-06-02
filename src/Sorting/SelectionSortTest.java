package Sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by quang on 6/1/16.
 */
public class SelectionSortTest {
    SelectionSort sortMachine;
    @Before
    public void setUp() throws Exception {
        sortMachine = new SelectionSort();
    }

    @After
    public void tearDown() throws Exception {
        sortMachine = null;
    }

    @Test
    public void testSort() throws Exception {
        int[] expected = {1,2,3,4,5,6};
        int[] sample = {3,1,4,2,6,5};
        sortMachine.sort(sample);
        assertArrayEquals(expected, sample);
    }
}