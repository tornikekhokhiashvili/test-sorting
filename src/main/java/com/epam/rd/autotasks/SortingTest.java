package com.epam.rd.autotasks;

import org.junit.Test;

import static org.junit.Assert.*;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test
    public void testNullCase(){
        int[] array=null;
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
        int[] array1 = {1, 2, 3, 4, 5};
        sorting.sort(array1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array1);

        int[] array2 = {10, 20, 30, 40, 50};
        sorting.sort(array2);
        assertArrayEquals(new int[]{10, 20, 30, 40, 50}, array2);

        int[] array3 = {-5, -4, -3, -2, -1};
        sorting.sort(array3);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, array3);
    }

    @Test
    public void testOtherCases() {
        int[] array1 = {5, 2, 8, 1, 4}; // Unsorted array
        sorting.sort(array1);

        // Assert that the array is sorted in ascending order
        assertArrayEquals(new int[]{1, 2, 4, 5, 8}, array1);

        int[] array2 = {9, 2, 5, 1, 6, 3}; // Unsorted array
        sorting.sort(array2);

        // Assert that the array is sorted in ascending order
        assertArrayEquals(new int[]{1, 2, 3, 5, 6, 9}, array2);

        int[] array3 = {10, -5, 0, -1, 8}; // Unsorted array with negative numbers
        sorting.sort(array3);

        // Assert that the array is sorted in ascending order
        assertArrayEquals(new int[]{-5, -1, 0, 8, 10}, array3);
    }

}