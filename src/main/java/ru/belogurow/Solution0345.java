package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/">345. Reverse Vowels of a String</a>
 */
public class Solution0345 {

  public String reverseVowels(String s) {
    char[] chars = s.toCharArray();

    for (int left = 0, right = s.length() - 1; left < right; ) {
      while (!isVowel(chars[left]) && left < right) {
        left++;
      }

      while (!isVowel(chars[right]) && left < right) {
        right--;
      }


      char temp = chars[left];
      chars[left] = chars[right];
      chars[right] = temp;

      left++;
      right--;

    }

    return new String(chars);
  }

  public boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
  }
}
