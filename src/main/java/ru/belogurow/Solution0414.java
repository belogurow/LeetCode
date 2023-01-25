package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/third-maximum-number/">414. Third Maximum Number</a>
 */
public class Solution0414 {

	public int thirdMax(int[] nums) {
		long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;

		for (Integer num : nums) {
			if (num == max1 || num == max2 || num == max3) {
				continue;
			}

			if (num > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max3 = max2;
				max2 = num;
			} else if (num > max3) {
				max3 = num;
			}
		}

		return max3 != Long.MIN_VALUE ? (int) max3 : (int) max1;
	}
}
