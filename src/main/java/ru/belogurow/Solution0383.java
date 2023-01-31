package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/ransom-note/">383. Ransom Note</a>
 */
public class Solution0383 {

	public boolean canConstruct(String ransomNote, String magazine) {
		int[] lastIndex = new int[26];

		for (char c : ransomNote.toCharArray()) {
			int newIndex = magazine.indexOf(c, lastIndex[c - 'a']);

			if (newIndex == -1) {
				// not found
				return false;
			}

			lastIndex[c - 'a'] = newIndex + 1;
		}

		return true;
	}
}
