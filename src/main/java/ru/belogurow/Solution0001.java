package ru.belogurow;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a>
 */
public class Solution0001 {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numsIdx = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			Integer idx = numsIdx.get(target - nums[i]);
			if (idx != null && idx != i) {
				return new int[]{idx, i};
			}

			numsIdx.put(nums[i], i);
		}

		return null;
	}
}
