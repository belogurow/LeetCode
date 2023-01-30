package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/n-th-tribonacci-number/">1137. N-th Tribonacci Number</a>
 */
public class Solution1137 {

	public int tribonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		}

		int[] arr = new int[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;

		for (int i = 3; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
		}

		return arr[n];
	}
}
