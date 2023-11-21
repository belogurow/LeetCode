package ru.belogurow;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/count-nice-pairs-in-an-array/">1814. Count Nice Pairs in an Array</a>
 */
public class Solution1814 {

	public int countNicePairs(int[] nums) {
		int mod = 1000000007;
		int nicePairs = 0;

		Map<Integer, Integer> count = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] - reverse(nums[i]);
			int c = count.getOrDefault(nums[i], 0);

			nicePairs = (nicePairs + c) % mod;
			count.put(nums[i], c + 1);
		}

		return nicePairs;
	}

	private int reverse(int x) {
		int reversedX = 0;

		while (x != 0) {
			int divided = x % 10;

			reversedX = reversedX * 10 + divided;
			x /= 10;
		}

		return reversedX;
	}
}
