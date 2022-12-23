package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/keyboard-row/">500. Keyboard Row</a>
 */
public class Solution500 {

    private static final String[] KEYBOARD_ROWS = new String[]
            {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

    public String[] findWords(String[] words) {
        return Arrays.stream(words)
                .filter(this::canBeTypedByOneRow)
                .toArray(String[]::new);
    }

    private boolean canBeTypedByOneRow(String word) {
        char[] letters = word.toLowerCase().toCharArray();

        String currentRow = getRowByLetter(letters[0]);
        for (int i = 1; i < letters.length; i++) {
            if (currentRow.indexOf(letters[i]) == -1) {
                return false;
            }
        }

        return true;
    }

    private String getRowByLetter(char letter) {
        for (String keyboardRow : KEYBOARD_ROWS) {
            if (keyboardRow.indexOf(letter) != -1) {
                return keyboardRow;
            }
        }

        return null;
    }
}
