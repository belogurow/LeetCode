package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/power-of-two">231. Power of Two</a>
 */
public class Solution0231 {

	public boolean isPowerOfTwo(int n) {

		return n > 0 && (n & (n - 1)) == 0;
	}
}
