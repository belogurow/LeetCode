package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/sort-colors">75. Sort Colors</a>
 */
public class Solution0075 {

	public void sortColors(int[] nums) {
		for (int left = 0, right = nums.length - 1, i = 0; i <= right;) {
			switch (nums[i]) {
				case 0 -> {
					swap(nums, i, left);
					i += 1;
					left += 1;
				}
				case 1 -> {
					i += 1;
				}
				case 2 -> {
					swap(nums, i, right);
					right -= 1;
				}
			}
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
