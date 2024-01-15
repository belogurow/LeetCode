package ru.belogurow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/3sum/">15. 3Sum</a>
 */
public class Solution0015 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int size = nums.length;

        for (int i = 0; i < size - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                // duplicate
                continue;
            }

            for (int j = i + 1, k = size - 1; j < k; ) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[j], nums[k]));

                    // skip duplicate for j
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    j++;

                    // skip duplicate for k
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }
}
