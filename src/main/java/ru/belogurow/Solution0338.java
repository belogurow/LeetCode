package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/counting-bits/">338. Counting Bits</a>
 */
public class Solution0338 {

	public int[] countBits(int n) {
		int[] ans = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			ans[i] = ans[i >> 1] + (i & 1);
		}

		return ans;
	}
}
