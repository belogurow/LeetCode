package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/climbing-stairs/">70. Climbing Stairs</a>
 */
public class Solution0070 {

	public int climbStairs(int n) {
		if (n < 3) {
			return n;
		}

		int first = 2, second = 1;

		for (int i = 3; i <= n; i++) {
			int newN = first + second;
			second = first;
			first = newN;
		}

		return first;
	}
}
