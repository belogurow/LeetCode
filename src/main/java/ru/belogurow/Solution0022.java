package ru.belogurow;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses,
 * write a function to generate all combinations of well-formed parentheses.
 *
 * @see <a href="https://leetcode.com/problems/generate-parentheses/">LeetCode link</a>
 */
public class Solution0022 {

	public List<String> generateParenthesis(int n) {
		ArrayList<String> result = new ArrayList<>();
		generateFor(result, n, 0, 0, "");
		return result;
	}

	private void generateFor(List<String> result, int n, int left, int right, String cur) {
		if (cur.length() == n * 2) {
			result.add(cur);
			return;
		}

		if (left < n) {
			generateFor(result, n, left + 1, right, cur + "(");
		}

		if (right < left) {
			generateFor(result, n, left, right + 1, cur + ")");
		}
	}
}
