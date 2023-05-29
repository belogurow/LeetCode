package ru.belogurow;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/determine-if-two-strings-are-close/">1657. Determine if Two Strings Are Close</a>
 */
public class Solution1657 {

  public boolean closeStrings(String word1, String word2) {
    int n = 26;
    int[] chars1 = new int[n],
        chars2 = new int[n];

    for (char c : word1.toCharArray()) {
      chars1[c - 'a'] += 1;
    }

    for (char c : word2.toCharArray()) {
      chars2[c - 'a'] += 1;
    }

    for (int i = 0; i < n; i++) {
      if (chars1[i] == 0 ^ chars2[i] == 0) { // if anyone has no such letter
        return false;
      }
    }

    Arrays.sort(chars1);
    Arrays.sort(chars2);

    return Arrays.equals(chars1, chars2);
  }
}
