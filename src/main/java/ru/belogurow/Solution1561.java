package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/maximum-number-of-coins-you-can-get/">1561. Maximum Number of Coins You Can Get</a>
 */
public class Solution1561 {

	public int maxCoins(int[] piles) {
		Arrays.sort(piles);

		int res = 0;

		for (int i = piles.length / 3; i < piles.length; i += 2) {
			res += piles[i];
		}

		return res;
	}
}
