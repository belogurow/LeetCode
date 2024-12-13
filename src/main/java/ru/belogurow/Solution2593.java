package ru.belogurow;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/3sum/">15. 3Sum</a>
 */
public class Solution2593 {

    public long findScore(int[] nums) {
        boolean[] marked = new boolean[nums.length];
        Queue<Node> queue = new PriorityQueue<>((o1, o2) -> (o1.value == o2.value) ? (o1.idx - o2.idx) : (o1.value - o2.value));

        for (int i = 0; i < nums.length; i++) {
            queue.add(new Node(nums[i], i));
        }

        long result = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (!marked[node.idx]) {
                result += node.value;
                marked[node.idx] = true;

                if (node.idx - 1 >= 0) {
                    marked[node.idx - 1] = true;
                }

                if (node.idx + 1 < nums.length) {
                    marked[node.idx + 1] = true;
                }
            }
        }

        return result;
    }

    private record Node(int value, int idx) {
    }
}
