package ru.belogurow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * You are given a string s and an array of strings words. All the strings of words are of the same length.
 * <p>
 * A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.
 * <p>
 * For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated substring because it is not the concatenation of any permutation of words.
 * Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.
 *
 * @see <a href="https://leetcode.com/problems/substring-with-concatenation-of-all-words/">LeetCode link</a>
 */
public class Solution0030 {

	public List<Integer> findSubstring(String s, String[] words) {
		Map<String, Long> counter = Arrays.stream(words)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		List<Integer> result = new ArrayList<>();
		int wordLength = words[0].length();
		int concatLength = wordLength * words.length;

		for (int i = 0; i <= s.length() - concatLength; i++) {
			if (containsSubstring(s, i, words, counter)) {
				result.add(i);
			}
		}

		return result;
	}

	private boolean containsSubstring(String s, int i, String[] words, Map<String, Long> counter) {
		Map<String, Long> currentCounter = new HashMap<>();

		for (int j = i; j < i + words.length * words[0].length(); j = j + words[0].length()) {
			String nextS = s.substring(j, j + words[0].length());

			if (!counter.containsKey(nextS)) {
				return false;
			}

			currentCounter.compute(nextS, (k, v) -> v == null ? 1 : v + 1);
		}

		return currentCounter.equals(counter);
	}
}
