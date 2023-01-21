package ru.belogurow;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/decompress-run-length-encoded-list/">1346. Check If N and Its Double Exist</a>
 */
public class Solution1346 {

    public boolean checkIfExist(int[] arr) {
        Set<Integer> nums = new HashSet<>();

        for (Integer n : arr) {
            if (nums.contains(n * 2) || ((n % 2 == 0) && (nums.contains(n / 2)))) {
                return true;
            }

            nums.add(n);
        }

        return false;
    }
}
