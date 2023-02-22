package ru.belogurow;

import java.util.Stack;

/**
 * @see <a href="https://leetcode.com/problems/backspace-string-compare/">844. Backspace String Compare</a>
 */
public class Solution0844 {

	public boolean backspaceCompare(String s, String t) {
		Stack<Character> sStack = new Stack<>();
		Stack<Character> tStack = new Stack<>();

		int sLen = s.length(), tLen = t.length();
		for (int i = 0, len = Math.max(sLen, tLen); i < len; i++) {
			if (i < sLen) {
				if (s.charAt(i) == '#') {
					if (!sStack.isEmpty()) {
						sStack.pop();
					}
				} else {
					sStack.push(s.charAt(i));
				}
			}

			if (i < tLen) {
				if (t.charAt(i) == '#') {
					if (!tStack.isEmpty()) {
						tStack.pop();
					}
				} else {
					tStack.push(t.charAt(i));
				}
			}
		}

		return sStack.equals(tStack);
	}
}
