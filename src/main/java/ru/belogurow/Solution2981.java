package ru.belogurow;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/find-longest-special-substring-that-occurs-thrice-i/">2981. Find Longest Special Substring That Occurs Thrice I</a>
 */
public class Solution2981 {

    public int maximumLength(String s) {
        int result = -1;
        char[] chars = s.toCharArray();

        for (int size = s.length() - 2; size >= 1; size--) {
            Map<String, Integer> substringCount = new HashMap<>();

            for (int start = 0, end = start + size; start + size <= s.length(); start++, end++) {
                if (isStringSpecial(chars, start, end)) {
                    String substring = s.substring(start, end);
                    substringCount.compute(substring, (k, v) -> v == null ? 1 : v + 1);
                }
            }

            for (int count : substringCount.values()) {
                if (count >= 3) {
                    return size;
                }
            }
        }

        return -1;
    }

    private boolean isStringSpecial(char[] chars, int start, int end) {
        for (int i = start + 1; i < end; i++) {
            if (chars[i] != chars[start]) {
                return false;
            }
        }

        return true;
    }
}
