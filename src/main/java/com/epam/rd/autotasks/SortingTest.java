
package com.epam.rd.autotasks;
import org.junit.Test;
import static org.junit.Assert.*;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        int[] array = null;
        sorting.sort(array);
    }

    @Test
    public void testEmptyCase(){
        int[] array = new int[0];
        sorting.sort(array);
        assertEquals(0, array.length);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] array = {4};
        sorting.sort(array);
        assertEquals(1, array.length);
        assertEquals(4, array[0]);
    }

    @Test
    public void testSortedArraysCase() {
        int[] array = { 2, 3, 4, 5};
        sorting.sort(array);
        int[] expected = { 2, 3, 4, 5};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testOtherCases() {
        int[] array = {5, 2, 4, 1, 3};
        int[] expectedSortedArray = {1, 2, 3, 4, 5};
        sorting.sort(array);
        assertArrayEquals(expectedSortedArray, array);
    }
}

