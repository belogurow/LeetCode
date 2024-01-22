package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/set-mismatch/">645. Set Mismatch</a>
 */
public class Solution0645 {

    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1];

        for (int num : nums) {
            count[num] += 1;
        }

        int[] res = new int[2];
        int found = 0;

        for (int i = 1; i < count.length; i++) {
            if (count[i] == 2) {
                res[0] = i;
                found += 1;
            } else if (count[i] == 0) {
                res[1] = i;
                found += 1;
            }

            if (found == 2) {
                break;
            }
        }

        return res;
    }
}
