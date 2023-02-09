package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/find-pivot-index/description/">724. Find Pivot Index</a>
 */
public class Solution0724 {

	public int pivotIndex(int[] nums) {
		int rightSum = 0;
		for (int n : nums) {
			rightSum += n;
		}

		int leftSum = 0;
		for (int i = 0; i < nums.length; i++) {
			rightSum -= nums[i];

			if (leftSum == rightSum) {
				return i;
			}

			leftSum += nums[i];
		}

		return -1;
	}
}
