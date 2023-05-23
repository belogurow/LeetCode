package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/reverse-words-in-a-string/">151. Reverse Words in a String</a>
 */
public class Solution0151 {

	public String reverseWords(String s) {
		String[] parts = s.trim().split("\\s+");
		if (parts.length == 1) {
			return parts[0];
		}

		StringBuilder sb = new StringBuilder();
		for (int i = parts.length - 1; i >= 0; i--) {
			sb.append(parts[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}

		return sb.toString();
	}
}
