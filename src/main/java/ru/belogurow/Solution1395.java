package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/count-number-of-teams/">1395. Count Number of Teams</a>
 */
public class Solution1395 {

    public int numTeams(int[] rating) {
        int res = 0;
        int n = rating.length;

        for (int j = 1; j <= n - 2; j++) {
            int leftLess = 0;
            int leftGreater = 0;

            int rightLess = 0;
            int rightGreater = 0;

            for (int i = 0; i < j; i++) {
                if (rating[i] < rating[j]) {
                    leftLess += 1;
                }

                if (rating[i] > rating[j]) {
                    leftGreater += 1;
                }
            }

            for (int k = j + 1; k < n; k++) {
                if (rating[j] < rating[k]) {
                    rightGreater += 1;
                }

                if (rating[j] > rating[k]) {
                    rightLess += 1;
                }
            }

            res += leftLess * rightGreater + leftGreater * rightLess;
        }

        return res;
    }
}
