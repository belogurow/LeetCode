package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/">88. Merge Sorted Array</a>
 */
public class Solution0088 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int k = m + n - 1, i = m - 1, j = n - 1; j >= 0; k--) {
			if (i >= 0 && nums1[i] > nums2[j]) {
				nums1[k] = nums1[i--];
			} else {
				nums1[k] = nums2[j--];
			}
		}
	}
}
