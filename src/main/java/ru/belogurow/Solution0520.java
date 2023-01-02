package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/detect-capital/">520. Detect Capital</a>
 */
public class Solution0520 {

    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if (len == 1) {
            return true;
        }

        if (Character.isUpperCase(word.charAt(0))) {
            boolean isAllCapital = Character.isUpperCase(word.charAt(1));

            for (int i = 1; i < len; i++) {
                if (isAllCapital) {
                    if (Character.isLowerCase(word.charAt(i))) {
                        return false;
                    }
                } else if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < len; i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
