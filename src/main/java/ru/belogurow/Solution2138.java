package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/">2138. Divide a String Into Groups of Size k</a>
 */
public class Solution2138 {

    public String[] divideString(String s, int k, char fill) {
        int sLen = s.length(),
                remains = sLen % k,
                groups = (remains == 0) ? sLen / k : sLen / k + 1;

        String[] ans = new String[groups];
        for (int i = 0; i < groups - 1; i++) {
            ans[i] = s.substring(k * i, k * (i + 1));
        }

        if (remains == 0) {
            ans[groups - 1] = s.substring(k * (groups - 1));
        } else {
            ans[groups - 1] = s.substring(k * (groups - 1)) + String.valueOf(fill).repeat(k - remains);
        }

        return ans;
    }
}
