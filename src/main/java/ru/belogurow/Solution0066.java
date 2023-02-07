package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/plus-one/">66. Plus One</a>
 */
public class Solution0066 {

  public int[] plusOne(int[] digits) {
    int len = digits.length;

    for (int i = len - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i] += 1;
        return digits;
      }

      digits[i] = 0;
    }

    int[] ans = new int[len + 1]; // [9] + 1 = [1, 0]
    ans[0] = 1;

    return ans;
  }
}
