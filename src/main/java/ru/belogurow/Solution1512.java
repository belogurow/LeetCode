package ru.belogurow;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/number-of-good-pairs/">1512. Number of Good Pairs</a>
 */
public class Solution1512 {

    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        Map<Integer, Integer> numToFrequency = new HashMap<>();

        for (int num : nums) {
            numToFrequency.compute(num, (k, v) -> (v == null) ? 1 : v + 1);
        }

        for (Integer value : numToFrequency.values()) {
            result += (value * (value - 1)) / 2; // NCR
        }


        return result;
    }

    public int numIdenticalPairs2(int[] nums) {
        int result = 0;
        int[] counts = new int[101]; // because 1 <= nums[i] <= 100

        for (int num : nums) {
            counts[num]++;
            result += counts[num] - 1;
        }

        return result;
    }
}
