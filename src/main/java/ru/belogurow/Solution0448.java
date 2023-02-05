package ru.belogurow;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">448. Find All Numbers Disappeared in an Array</a>
 */
public class Solution0448 {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		for (int n : nums) {
			int idx = Math.abs(n);
			if (nums[idx - 1] > 0) {
				nums[idx - 1] *= -1;
			}
		}

		List<Integer> ans = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				ans.add(i + 1);
			}
		}

		return ans;
	}
}
