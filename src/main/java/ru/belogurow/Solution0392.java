package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/is-subsequence/">392. Is Subsequence</a>
 */
public class Solution0392 {

	public boolean isSubsequence(String s, String t) {
		if (s.isEmpty()) {
			return true;
		}

		for (int sIdx = 0, tIdx = 0, sLen = s.length(), tLen = t.length(); tIdx < tLen; tIdx++) {
			if (t.charAt(tIdx) == s.charAt(sIdx)) {
				sIdx++;
			}

			if (sIdx == sLen) {
				return true;
			}
		}

		return false;
	}
}
