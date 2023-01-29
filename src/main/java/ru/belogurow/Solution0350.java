package ru.belogurow;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/">350. Intersection of Two Arrays II</a>
 */
public class Solution0350 {

	public int[] intersect(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			return intersect(nums2, nums1);
		}

		int[] count = new int[1001];
		List<Integer> intersection = new ArrayList<>();

		for (int k : nums1) {
			count[k] += 1;
		}

		for (int k : nums2) {
			if (count[k] > 0) {
				intersection.add(k);
				count[k] -= 1;
			}
		}

		int[] res = new int[intersection.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = intersection.get(i);
		}
		return res;
	}
}
