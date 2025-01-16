package ru.belogurow;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/">2657. Find the Prefix Common Array of Two Arrays</a>
 */
public class Solution2657 {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> nums = new HashSet<>();
        int[] result = new int[A.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = result[Math.max(i - 1, 0)];

            if (nums.contains(A[i])) {
                result[i] += 1;
            } else {
                nums.add(A[i]);
            }

            if (nums.contains(B[i])) {
                result[i] += 1;
            } else {
                nums.add(B[i]);
            }
        }

        return result;
    }
}
