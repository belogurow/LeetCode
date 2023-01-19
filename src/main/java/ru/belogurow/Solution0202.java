package ru.belogurow;

/**
 * @see <a href=https://leetcode.com/problems/happy-number/">202. Happy Number</a>
 */
public class Solution0202 {

	public boolean isHappy(int n) {
		int prevOneDigitNumber = Integer.MIN_VALUE;

		while (n != 1 && n != prevOneDigitNumber) {
			if (n < 10) {
				prevOneDigitNumber = n;
			}

			int newNumber = 0;

			while (n != 0) {
				int mod = n % 10;
				newNumber += mod * mod;
				n /= 10;
			}

			n = newNumber;
		}

		return n == 1;
	}
}
