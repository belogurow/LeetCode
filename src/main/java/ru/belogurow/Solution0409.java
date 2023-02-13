package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/longest-palindrome/">409. Longest Palindrome</a>
 */
public class Solution0409 {

	public int longestPalindrome(String s) {
		int[] count = new int[128];

		int countWithOddSymbols = 0;
		int palindromeLength = 0;

		for (char c : s.toCharArray()) {
			count[c] += 1;

			if (count[c] % 2 == 0) {
				countWithOddSymbols -= 1;
				palindromeLength += 2;
			} else {
				countWithOddSymbols += 1;
			}
		}

		if (countWithOddSymbols > 0) {
			palindromeLength += 1; // center of palindrome
		}

		return palindromeLength;
	}
}
