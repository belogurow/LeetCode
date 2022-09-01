package ru.belogurow;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 * <p>
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">LeetCode link</a>
 */
public class Solution0026 {

	public int removeDuplicates(int[] nums) {
		int k = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[k]) {
				nums[k + 1] = nums[i];
				k++;
			}
		}

		return k + 1;
	}

//	public int removeDuplicates(int[] nums) {
//		int k = nums.length;
//
//		for (int i = 1; i < k; i++) {
//			if (nums[i] == nums[i - 1]) {
//				for (int j = i + 1, m = i; j < k; j++, m++) {
//					swapElements(nums, m, j);
//				}
//				k--;
//				i--;
//			}
//		}
//
//		return k;
//	}
//
//	private void swapElements(int[] nums, int i, int j) {
//		int temp = nums[i];
//		nums[i] = nums[j];
//		nums[j] = temp;
//	}
}
