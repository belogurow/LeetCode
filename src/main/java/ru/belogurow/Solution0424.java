package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/longest-repeating-character-replacement/">424. Longest Repeating Character Replacement</a>
 * <p>
 * todo retry
 */
public class Solution0424 {

	public int characterReplacement(String s, int k) {
		int[] charsCount = new int[26];
		int mostFreq = 0, maxLen = 0;
		int start = 0, end = 0;

		while (end < s.length()) {
			int sChar = s.charAt(end) - 'A';
			charsCount[sChar] += 1;
			mostFreq = Math.max(mostFreq, charsCount[sChar]);

			if ((end - start + 1) - mostFreq > k) {
				charsCount[s.charAt(start) - 'A'] -= 1;
				start += 1;
			}


			maxLen = Math.max(end - start + 1, maxLen);
			end += 1;
		}

		return maxLen;
	}
}
