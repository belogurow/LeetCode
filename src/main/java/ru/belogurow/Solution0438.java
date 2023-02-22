package ru.belogurow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/">438. Find All Anagrams in a String</a>
 */
public class Solution0438 {

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> ans = new ArrayList<>();

		int[] pChars = new int[26];
		int[] windowsChars = new int[26];
		for (int i = 0; i < p.length(); i++) {
			pChars[p.charAt(i) - 'a'] += 1;
			windowsChars[s.charAt(i) - 'a'] += 1;
		}

		for (int i = 0, sLen = s.length(), pLen = p.length(); i < sLen; i++) {
			if (Arrays.equals(pChars, windowsChars)) {
				ans.add(i);
			}
			windowsChars[s.charAt(i) - 'a'] -= 1;
			if (i + pLen < sLen) {
				windowsChars[s.charAt(i + pLen) - 'a'] += 1;
			}
		}

		return ans;
	}
}
