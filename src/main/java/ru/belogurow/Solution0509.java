package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/fibonacci-number/">509. Fibonacci Number</a>
 */
public class Solution0509 {

	public int fib(int n) {
		if (n <= 1) {
			return n;
		}

		int first = 1, second = 0;

		for (int i = 2; i <= n; i++) {
			int temp = first;
			first += second;
			second = temp;
		}

		return first;
	}
}
