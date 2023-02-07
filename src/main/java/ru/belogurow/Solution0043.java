package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/multiply-strings/">43. Multiply Strings</a>
 */
public class Solution0043 {

	public String multiply(String num1, String num2) {
		int[] nums = new int[num1.length() + num2.length()];

		for (int j = num1.length() - 1; j >= 0; j--) {
			for (int k = num2.length() - 1; k >= 0; k--) {
				int newNum = toDigit(num1.charAt(j)) * toDigit(num2.charAt(k)) + nums[j + k + 1];

				nums[j + k + 1] = newNum % 10;
				nums[j + k] += newNum / 10;
			}
		}

		int i = 0;
		while (i < nums.length && nums[i] == 0) {
			i++;
		}

		if (nums.length == i) {
			return "0";
		}

		StringBuilder res = new StringBuilder();
		while (i < nums.length) {
			res.append(nums[i++]);
		}

		return res.toString();
	}

	private int toDigit(char c) {
		return c - '0';
	}
}
