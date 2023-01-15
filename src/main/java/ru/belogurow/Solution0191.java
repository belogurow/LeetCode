package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/number-of-1-bits/">191. Number of 1 Bits</a>
 */
public class Solution0191 {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }

        return count;
    }
}
