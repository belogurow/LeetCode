package ru.belogurow;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @see <a href="https://leetcode.com/problems/separate-the-digits-in-an-array/">2553. Separate the Digits in an Array</a>
 */
public class Solution2553 {

	public int[] separateDigits(int[] nums) {
		Deque<Integer> answer = new ArrayDeque<>();

		for (int i = nums.length - 1; i >= 0; i--) {
			int num = nums[i];
			while (num != 0) {
				answer.push(num % 10);
				num /= 10;
			}
		}

		int[] ans = new int[answer.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = answer.pop();
		}

		return ans;
	}
}
