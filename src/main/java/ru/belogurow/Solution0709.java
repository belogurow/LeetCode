package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/to-lower-case/">709. To Lower Case</a>
 */
public class Solution0709 {

    public String toLowerCase(String s) {
        StringBuilder res = new StringBuilder(s.length());

        for (char c : s.toCharArray()) {
            res.append('A' <= c && c <= 'Z' ? (char) (c + 32) : c);
        }

        return res.toString();
    }
}
