package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/">1897. Redistribute Characters to Make All Strings Equal</a>
 */
public class Solution1897 {

    public boolean makeEqual(String[] words) {
        int[] letters = new int[26];

        for (String word : words) {
            for (char c : word.toCharArray()) {
                letters[c - 'a']++;
            }
        }

        for (int letter : letters) {
            if (letter % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}
