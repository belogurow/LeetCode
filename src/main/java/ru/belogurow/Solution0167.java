package ru.belogurow;


/**
 * @see <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">167. Two Sum II - Input Array Is Sorted</a>
 */
public class Solution0167 {

	public int[] twoSum(int[] numbers, int target) {
		int left = 0, right = numbers.length - 1;

		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum > target) {
				right--;
			} else if (sum < target) {
				left++;
			} else {
				return new int[]{left + 1, right + 1};
			}
		}

		return null;
	}
}
