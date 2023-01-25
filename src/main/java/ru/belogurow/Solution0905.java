package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/sort-array-by-parity/">905. Sort Array By Parity</a>
 */
public class Solution0905 {

	public int[] sortArrayByParity(int[] nums) {
		for (int i = 0, j = 0; j < nums.length; j++) {
			if (nums[j] % 2 == 0) {
				swap(nums, i, j);
				i += 1;
			}
		}

		return nums;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
