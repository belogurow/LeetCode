package ru.belogurow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/4sum/description/">18. 4Sum</a>
 */
public class Solution0018 {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums == null || nums.length < 4) {
			return result;
		}

		int size = nums.length;
		Arrays.sort(nums);

		for (int i = 0; i < size - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				// skip duplicate
				continue;
			}

			for (int j = i + 1; j < size - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					// skip duplicate
					continue;
				}

				int left = j + 1;
				int right = size - 1;

				while (left < right) {
					long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

					if (sum == target) {
						result.add(List.of(nums[i], nums[j], nums[left], nums[right]));
						left++;
						right--;

						// skip duplicates
						while (left < right && nums[left] == nums[left - 1]) {
							left++;
						}
						while (left < right && nums[right] == nums[right + 1]) {
							right--;
						}
					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}
			}
		}

		return result;
	}
}
