package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/">1347. Minimum Number of Steps to Make Two Strings Anagram</a>
 */
public class Solution1347 {

    public int minSteps(String s, String t) {
        int[] letters = new int[26]; // letters count

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a'] += 1;
            letters[t.charAt(i) - 'a'] -= 1;
        }

        int moves = 0;

        for (int letter : letters) {
            if (letter > 0) {
                moves += letter;
            }
        }

        return moves;
    }
}
