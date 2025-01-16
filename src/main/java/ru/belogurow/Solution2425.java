package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/bitwise-xor-of-all-pairings/">2425. Bitwise XOR of All Pairings</a>
 */
public class Solution2425 {

    public int xorAllNums(int[] nums1, int[] nums2) {
        int result = 0;

        if (nums2.length % 2 != 0) {
            for (int num1 : nums1) {
                result ^= num1;
            }
        }

        if (nums1.length % 2 != 0) {
            for (int num2 : nums2) {
                result ^= num2;
            }
        }

        return result;
    }
}
