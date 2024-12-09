package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/special-array-i">3151. Special Array I</a>
 */
public class Solution3151 {

    public boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) return true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2) return false;
        }
        return true;
    }
}
