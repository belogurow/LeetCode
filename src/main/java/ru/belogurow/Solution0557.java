package ru.belogurow;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @see <a href="https://leetcode.com/problems/search-insert-position/">35. Search Insert Position</a>
 */
public class Solution0557 {

	public String reverseWords(String s) {
		return Arrays.stream(s.split(" "))
				.map(this::reverseString)
				.collect(Collectors.joining(" "));
	}

	public String reverseString(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			swap(chars, i, j);
		}

		return new String(chars);
	}

	private void swap(char[] s, int i, int j) {
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
}
