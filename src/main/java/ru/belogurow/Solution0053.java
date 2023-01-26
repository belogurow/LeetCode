package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/maximum-subarray/">53. Maximum Subarray</a>
 *
 * todo divide and conquer
 */
public class Solution0053 {

	public int maxSubArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE, curSum = 0;

		for (Integer num : nums) {
			curSum += num;
			maxSum = Math.max(curSum, maxSum);

			if (curSum < 0) {
				curSum = 0;
			}
		}

		return maxSum;
	}
}
