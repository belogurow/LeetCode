package ru.belogurow;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/">350. Intersection of Two Arrays II</a>
 */
public class Solution0019 {

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        int[] count = new int[1001];
        List<Integer> intersection = new ArrayList();

        for (int i = 0; i < nums1.length; i++) {
            count[nums1[i]] += 1;
        }

        for (int j = 0; j < nums2.length; j++) {
            if (count[nums2[j]] > 0) {
                intersection.add(nums2[j]);
                count[nums2[j]] -= 1;
            }
        }

        int[] res = new int[intersection.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = intersection.get(i);
        }
        return res;
    }
}
