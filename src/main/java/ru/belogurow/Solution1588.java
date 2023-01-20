package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/sum-of-all-odd-length-subarrays/">1588. Sum of All Odd Length Subarrays</a>
 */
public class Solution1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int curSum = 0;

            for (int j = i; j < arr.length; j++) {
                curSum += arr[j];

                if ((j - i) % 2 == 0) {
                    sum += curSum;
                }
            }
        }

        return sum;
    }
}
