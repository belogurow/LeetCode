package ru.belogurow;

/**
 * Implement strStr().
 * <p>
 * Given two strings needle and haystack,
 * return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 *
 * @see <a href="https://leetcode.com/problems/implement-strstr/">LeetCode link</a>
 */
public class Solution0028 {

	public int strStr(String haystack, String needle) {
		if (needle.isEmpty() || haystack.isEmpty()) {
			return 0;
		}

		char[] needleChars = needle.toCharArray();
		char[] haystackChars = haystack.toCharArray();

		for (int i = 0; i < haystackChars.length; i++) {
			if (fullOccurrence(haystackChars, needleChars, i)) {
				return i;
			}
		}

		return -1;
	}

	private boolean fullOccurrence(char[] haystackChars, char[] needleChars, int i) {
		for (int j = i, n = 0; j < haystackChars.length; ) {
			if (haystackChars[j] == needleChars[n]) {
				n++;
				j++;
			} else {
				return false;
			}

			if (n >= needleChars.length) {
				return true;
			}
		}

		return false;
	}
}
