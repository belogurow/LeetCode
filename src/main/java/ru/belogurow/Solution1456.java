package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/">1456. Maximum Number of Vowels in a Substring of Given Length</a>
 */
public class Solution1456 {

    public int maxVowels(String s, int k) {
        int[] vowels = new int[26];
        vowels['a' - 'a'] = 1;
        vowels['e' - 'a'] = 1;
        vowels['i' - 'a'] = 1;
        vowels['o' - 'a'] = 1;
        vowels['u' - 'a'] = 1;

        int max = 0, current = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < k) { // first window
                current += vowels[s.charAt(i) - 'a'];
            } else {
                current = current + vowels[s.charAt(i) - 'a'] - vowels[s.charAt(i - k) - 'a'];
            }
            
            max = Math.max(max, current);
        }

        return max;
    }
}
