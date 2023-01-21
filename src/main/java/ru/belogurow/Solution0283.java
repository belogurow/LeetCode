package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/move-zeroes/description/">283. Move Zeroes</a>
 */
public class Solution0283 {

    public void moveZeroes(int[] nums) {
        for (int i = 0, numberIdx = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (numberIdx != i) {
                    nums[numberIdx] = nums[i];
                    nums[i] = 0;
                }

                numberIdx++;
            }
        }
    }
}
