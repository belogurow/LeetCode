package ru.belogurow;


/**
 * @see <a href="https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/">1685. Sum of Absolute Differences in a Sorted Array</a>
 */
public class Solution1685 {

	public int[] getSumAbsoluteDifferences(int[] nums) {
		final int N = nums.length;

		int[] prefix = new int[N];
		prefix[0] = nums[0];

		int[] suffix = new int[N];
		suffix[N - 1] = nums[N - 1];

		for (int i = 1; i < N - 1; i++) {
			prefix[i] = nums[i] + prefix[i - 1];
			suffix[N - 1 - i] = nums[N - 1 - i] + suffix[N - i];
		}

		int[] result = new int[N];

		for (int i = 0; i < N; i++) {
			result[i] = nums[i] * (2 * i + 1 - N);

			if (i == 0) {
				result[i] += suffix[i + 1];
			} else if (i == N - 1) {
				result[i] -= prefix[i - 1];
			} else {
				result[i] = result[i] + suffix[i + 1] - prefix[i - 1];
			}
		}

		return result;
	}
}
