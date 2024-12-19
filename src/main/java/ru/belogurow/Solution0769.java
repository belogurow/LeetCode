package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/max-chunks-to-make-sorted/">769. Max Chunks To Make Sorted</a>
 */
public class Solution0769 {

    public int maxChunksToSorted(int[] arr) {
        int res = 0;

        int prefixSum = 0;
        int correctPrefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            correctPrefixSum += i;
            prefixSum += arr[i];

            if (correctPrefixSum == prefixSum) {
                res += 1;
            }
        }

        return res;
    }
}
