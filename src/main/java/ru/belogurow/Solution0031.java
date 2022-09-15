package ru.belogurow;

/**
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
 * <p>
 * Given an array of integers nums, find the next permutation of nums.
 *
 * @see <a href="https://leetcode.com/problems/substring-with-concatenation-of-all-words/">LeetCode link</a>
 */
public class Solution0031 {
	public void nextPermutation(int[] nums) {
		if (nums.length == 1) {
			return;
		}

		int mainIdx = -1;
		int prev = nums[nums.length - 1];
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < prev) {
				mainIdx = i;
				break;
			}
			prev = nums[i];
		}

		if (mainIdx == -1) {
			reverseElements(nums, 0);
			return;
		}

		int nextAfterMainIdx = -1;
		int min = Integer.MAX_VALUE;
		for (int i = mainIdx + 1; i < nums.length; i++) {
			if (nums[mainIdx] < nums[i] && nums[i] <= min) {
				min = nums[i];
				nextAfterMainIdx = i;
			}
		}

		swapElements(nums, mainIdx, nextAfterMainIdx);
		reverseElements(nums, mainIdx + 1);
	}

	private void reverseElements(int[] nums, int startI) {
		for (int i = startI, j = nums.length - 1; i < j; i++, j--) {
			swapElements(nums, i, j);
		}
	}

	private void swapElements(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
