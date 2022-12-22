package ru.belogurow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/">1365. How Many Numbers Are Smaller Than the Current Number</a>
 */
public class Solution1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> numToCount = new HashMap<>();
        int[] sorted = Arrays.stream(nums).sorted().toArray();

        for (int i = 0; i < sorted.length; i++) {
            numToCount.putIfAbsent(sorted[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            sorted[i] = numToCount.get(nums[i]);
        }
        return sorted;
    }
}
