package ru.belogurow;

import java.util.Stack;

/**
 * @see <a href="https://leetcode.com/problems/asteroid-collision/">735. Asteroid Collision</a>
 */
public class Solution0735 {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<Integer>();

        for (int ast : asteroids) {
            if (ast >= 0 || st.isEmpty()) {
                st.push(ast);
                continue;
            }

            while (!st.isEmpty() && st.peek() > 0 && (Math.abs(st.peek()) < Math.abs(ast))) {
                st.pop();
            }

            if (!st.isEmpty() && st.peek() > 0 && (Math.abs(st.peek()) == Math.abs(ast))) {
                // both explode
                st.pop();
                continue;
            }

            if (st.isEmpty() || st.peek() < 0) {
                st.push(ast);
            }
        }

        int[] res = new int[st.size()];

        int i = st.size() - 1;
        while (!st.isEmpty()) {
            res[i--] = st.pop();
        }

        return res;
    }
}
