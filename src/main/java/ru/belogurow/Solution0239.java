package ru.belogurow;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @see <a href="https://leetcode.com/problems/sliding-window-maximum/">239. Sliding Window Maximum</a>
 */
public class Solution0239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            // remove indices that are out of bound
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // remove indices with value less than nums[i]
            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.add(i);
            if (i >= k - 1) {
                res[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return res;
    }
}
