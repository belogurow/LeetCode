package ru.belogurow;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @see <a href="https://leetcode.com/problems/number-of-recent-calls/">LeetCode link</a>
 */
public class Solution0933 {

    public static class RecentCounter {

        private Deque<Integer> requests;

        public RecentCounter() {
            this.requests = new ArrayDeque<>();
        }

        public int ping(int t) {
            requests.addLast(t);

            while (!requests.isEmpty() && requests.peek() < t - 3000) {
                requests.poll();
            }

            return requests.size();
        }
    }
}
