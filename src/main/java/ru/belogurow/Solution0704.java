package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/binary-search/">704. Binary Search</a>
 */
public class Solution0704 {

	public int search(int[] nums, int target) {
		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;
	}
}
