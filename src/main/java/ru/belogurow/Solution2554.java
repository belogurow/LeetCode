package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/">2554. Maximum Number of Integers to Choose From a Range I</a>
 */
public class Solution2554 {

	public int maxCount(int[] banned, int n, int maxSum) {
		int[] bannedIdx = new int[10001];

		for (int b : banned) {
			bannedIdx[b] = 1;
		}

		int numberCount = 0;
		for (int i = 1; i <= n; i++) {
			if (bannedIdx[i] == 1) {
				continue;
			}

			maxSum -= i;
			if (maxSum < 0) {
				break;
			}

			numberCount += 1;

		}

		return numberCount;
	}
}
