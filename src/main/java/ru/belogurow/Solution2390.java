package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/removing-stars-from-a-string">LeetCode link</a>
 */
public class Solution2390 {

    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (char c : s.toCharArray()) {
            if (c == '*') {
                sb.deleteCharAt(idx - 1);
                idx--;
            } else {
                sb.append(c);
                idx++;
            }
        }

        return sb.toString();
    }
}
