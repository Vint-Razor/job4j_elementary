package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when3NumThenSort() {
        int[]data = {7, 2, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = {2, 4, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when5NumThenSort() {
        int[] date = {5, 2, 7, 9, 4};
        int[] result = SortSelected.sort(date);
        int[] expected = {2, 4, 5, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }
}