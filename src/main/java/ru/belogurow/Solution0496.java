package ru.belogurow;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @see <a href="https://leetcode.com/problems/next-greater-element-i/description/">496. Next Greater Element I</a>
 */
public class Solution0496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nums2Idx = new int[10001];
        for (int i = 0, len = nums2.length; i < len; i++) {
            nums2Idx[nums2[i]] = i;
        }

        int[] ans = new int[nums1.length];
        for (int i = 0, len = nums1.length; i < len; i++) {
            ans[i] = -1;
            int num2idx = nums2Idx[nums1[i]];

            for (int j = num2idx + 1; j < nums2.length; j++) {
                if (nums2[num2idx] < nums2[j]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }

        return ans;
    }

    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        // int array faster than HashMap<>
        int[] numToGreatest = new int[10001];
        for (int i = 0; i < numToGreatest.length; i++) {
            numToGreatest[i] = -1;
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int num : nums2) {
            while (!deque.isEmpty() && deque.peek() < num) {
                numToGreatest[deque.pop()] = num;
            }

            deque.push(num);
        }

        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = numToGreatest[nums1[i]];
        }

        return arr;
    }
}
