package ru.belogurow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/isomorphic-strings/">205. Isomorphic Strings</a>
 */
public class Solution0205 {

	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> charMap = new HashMap<>();
		Set<Character> usedT = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i), tChar = t.charAt(i);
			Character isomorphicChar = charMap.get(sChar);

			if (isomorphicChar == null) {
				if (!usedT.add(tChar)) {
					return false;
				}

				charMap.put(sChar, tChar);
			} else {
				if (!isomorphicChar.equals(tChar)) {
					return false;
				}
			}
		}

		return true;
	}

}
