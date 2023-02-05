package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">977. Squares of a Sorted Array</a>
 */
public class Solution0977 {

	public int[] sortedSquares(int[] nums) {
		int[] ans = new int[nums.length];

		for (int i = nums.length - 1, left = 0, right = nums.length - 1; i >= 0; i--) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				ans[i] = nums[left] * nums[left];
				left++;
			} else {
				ans[i] = nums[right] * nums[right];
				right--;
			}
		}

		return ans;
	}
}
