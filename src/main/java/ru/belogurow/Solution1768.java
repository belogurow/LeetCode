package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/merge-strings-alternately/">1768. Merge Strings Alternately</a>
 */
public class Solution1768 {

    public String mergeAlternately(String word1, String word2) {
        int totalLen = word1.length() + word2.length();
        StringBuilder s = new StringBuilder(totalLen);

        for (int i = 0, j = 0; i + j < totalLen; ) {
            if (i < word1.length()) {
                s.append(word1.charAt(i++));
            }

            if (j < word2.length()) {
                s.append(word2.charAt(j++));
            }
        }

        return s.toString();
    }
}
