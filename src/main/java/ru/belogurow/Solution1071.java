package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/">1071. Greatest Common Divisor of Strings</a>
 */
public class Solution1071 {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
