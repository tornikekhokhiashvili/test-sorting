package com.epam.rd.autotasks;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test
    public void testNullCase(){
        int[] array = new int[0];
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
        int[] array1 = {1, 2, 4, 5, 8};
        sorting.sort(array1);
        assertArrayEquals(new int[]{1, 2, 4, 5, 8}, array1);

    }

    @Test
    public void testOtherCases() {
        int[] array3 = {-5, -1, 0, 8, 10};
        sorting.sort(array3);
        assertArrayEquals(new int[]{-5, -1, 0, 8, 10}, array3);
    }

}