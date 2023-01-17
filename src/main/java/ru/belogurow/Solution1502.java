package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/">1502. Can Make Arithmetic Progression From Sequence</a>
 */
public class Solution1502 {

    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length == 2) {
            return true;
        }

        Arrays.sort(arr);

        int delta = arr[1] - arr[0];
        for (int i = 2, len = arr.length; i < len; i++) {
            if (arr[i] - arr[i - 1] != delta) {
                return false;
            }
        }

        return true;
    }
}
