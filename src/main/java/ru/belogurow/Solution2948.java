package ru.belogurow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/">2948. Make Lexicographically Smallest Array by Swapping Elements</a>
 */
public class Solution2948 {

    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int[] numsSorted = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsSorted[i] = nums[i];
        }
        Arrays.sort(numsSorted);

        Map<Integer, LinkedList<Integer>> groups = new HashMap<>();
        Map<Integer, Integer> numToGroup = new HashMap<>();

        for (int i = 0, groupIdx = -1; i < nums.length; i++) {
            if (i == 0 || (Math.abs(numsSorted[i] - numsSorted[i - 1]) > limit)) {
                LinkedList<Integer> newGroup = new LinkedList<>();
                newGroup.add(numsSorted[i]);

                groupIdx++;
                groups.put(groupIdx, newGroup);
            } else {
                groups.get(groupIdx).add(numsSorted[i]);
            }

            numToGroup.put(numsSorted[i], groupIdx);
        }

        for (int i = 0; i < nums.length; i++) {
            int group = numToGroup.get(nums[i]);
            nums[i] = groups.get(group).pop();
        }

        return nums;
    }
}
