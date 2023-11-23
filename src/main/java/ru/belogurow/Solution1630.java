package ru.belogurow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/arithmetic-subarrays/">1630. Arithmetic Subarrays</a>
 */
public class Solution1630 {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int arrLength = r[i] - l[i] + 1;
            int[] arr = new int[arrLength];
            System.arraycopy(nums, l[i], arr, 0, arrLength);

            result.add(isProgression(arr));
        }

        return result;
    }

    private boolean isProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }

        return true;
    }
}
