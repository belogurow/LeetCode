package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/valid-anagram/">242. Valid Anagram</a>
 */
public class Solution0242 {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] chars = new int[26];

		for (int i = 0; i < t.length(); i++) {
			chars[s.charAt(i) - 'a'] += 1;
			chars[t.charAt(i) - 'a'] -= 1;
		}

		for (int aChar : chars) {
			if (aChar != 0) {
				return false;
			}
		}

		return true;
	}

}
