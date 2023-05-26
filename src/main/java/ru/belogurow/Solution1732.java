package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/find-the-highest-altitude/">1732. Find the Highest Altitude</a>
 */
public class Solution1732 {

	public int largestAltitude(int[] gain) {
		int max = Math.max(0, gain[0]);

		for (int i = 1; i < gain.length; i++) {
			gain[i] += gain[i - 1];
			max = Math.max(max, gain[i]);
		}


		return max;
	}
}
