package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville">3289. The Two Sneaky Numbers of Digitville</a>
 */
public class Solution3289 {

    public int[] getSneakyNumbers(int[] nums) {
        int[] count = new int[nums.length - 2];

        for (int num : nums) {
            count[num] += 1;
        }

        int[] result = new int[2];
        for (int i = 0, k = 0; k < 2; i++) {
            if (count[i] == 2) {
                result[k] = i;
                k++;
            }
        }

        return result;
    }
}
