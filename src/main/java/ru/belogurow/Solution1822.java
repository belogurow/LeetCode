package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/sign-of-the-product-of-an-array">1822. Sign of the Product of an Array</a>
 */
public class Solution1822 {

    public int arraySign(int[] nums) {
        int sign = 1;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }

            if (num < 0) {
                sign = -sign;
            }
        }

        return sign;
    }
}
