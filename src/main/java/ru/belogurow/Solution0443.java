package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/string-compression/">443. String Compression</a>
 */
public class Solution0443 {

  public int compress(char[] chars) {
    char prev = chars[0];
    int count = 1; // for chars[0]
    int newLength = 0;

    for (int i = 1; i < chars.length; i++) {
      if (prev == chars[i]) {
        count++;
      } else {
        char current = chars[i];

        newLength = addNewChar(chars, prev, count, newLength);

        prev = current;
        count = 1;
      }
    }

    return addNewChar(chars, prev, count, newLength);
  }

  private int addNewChar(char[] chars, char c, int count, int newLength) {
    chars[newLength++] = c;

    if (count > 1) {
      for (char cCount : String.valueOf(count).toCharArray()) {
        chars[newLength++] = cCount;
      }
    }

    return newLength;
  }
}
