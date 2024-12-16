package ru.belogurow;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/">3264. Final Array State After K Multiplication Operations I</a>
 */
public class Solution3264 {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<Num> queue = new PriorityQueue<>((a, b) -> (a.value == b.value) ? (a.idx - b.idx) : (a.value - b.value));

        for (int i = 0; i < nums.length; i++) {
            queue.add(new Num(nums[i], i));
        }

        while (k > 0) {
            Num num = queue.poll();
            nums[num.idx] = num.value * multiplier;
            queue.add(new Num(nums[num.idx], num.idx));

            k--;
        }

        return nums;
    }

    private record Num(int value, int idx) {}
}
