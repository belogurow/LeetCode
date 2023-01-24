package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/">1356. Sort Integers by The Number of 1 Bits</a>
 */
public class Solution1356 {

    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += bitsCount(arr[i]) * 10001;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10001;
        }

        return arr;
    }

    private int bitsCount(int n) {
        int c = 0;

        while (n != 0) {
            n &= (n - 1);
            c++;
        }

        return c;
    }
}
