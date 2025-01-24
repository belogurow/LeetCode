package ru.belogurow;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/find-eventual-safe-states/">802. Find Eventual Safe States</a>
 */
public class Solution0802 {

    // node statuses
    private static final int UNKNOWN_STATUS = 0;
    private static final int SAFE_NODE = 1;
    private static final int NOT_SAFE_NODE = 2;

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] nodeStatus = new int[graph.length];

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (isSafeNode(graph, nodeStatus, i)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean isSafeNode(int[][] graph, int[] nodeStatus, int i) {
        if (nodeStatus[i] != UNKNOWN_STATUS) {
            return nodeStatus[i] == SAFE_NODE;
        }

        nodeStatus[i] = NOT_SAFE_NODE;
        // for cycle node will be not safe

        for (int nextI : graph[i]) {
            if (!isSafeNode(graph, nodeStatus, nextI)) {
                return false; // If any neighbor is unsafe, this node is unsafe
            }
        }

        // All neighbors are safe, so mark this node as safe
        nodeStatus[i] = SAFE_NODE;
        return true;
    }
}
