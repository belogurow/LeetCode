package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/second-largest-digit-in-a-string/">1796. Second Largest Digit in a String</a>
 */
public class Solution1796 {

	public int secondHighest(String s) {
		int firstMax = -1, secondMax = -1;

		for (int i = 0, len = s.length(); i < len; i++) {
			char c = s.charAt(i);
			if (!Character.isDigit(c)) {
				continue;
			}

			int num = c - '0';

			if (num == firstMax) {
				continue;
			} else if (num > firstMax) {
				secondMax = firstMax;
				firstMax = num;
			} else if (num > secondMax) {
				secondMax = num;
			}
		}

		return secondMax;
	}
}
