package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/reverse-string/">344. Reverse String</a>
 */
public class Solution0344 {

	public void reverseString(char[] s) {
		for (int i = 0, j = s.length - 1; i < j; i++, j--) {
			swap(s, i, j);
		}
	}

	private void swap(char[] s, int i, int j) {
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
}
