package ru.belogurow;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
 */
public class Solution0020 {

	public boolean isValid(String s) {
		if (s.length() % 2 == 1) {
			return false;
		}

		Deque<Character> brackets = new ArrayDeque<>();

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				brackets.push(c);
				continue;
			}

			if (brackets.isEmpty()) {
				return false;
			} else if (c == ')' && brackets.peek() == '(') {
				brackets.pop();
			} else if (c == '}' && brackets.peek() == '{') {
				brackets.pop();
			} else if (c == ']' && brackets.peek() == '[') {
				brackets.pop();
			} else {
				return false;
			}
		}

		return brackets.isEmpty();
	}
}
