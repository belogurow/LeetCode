package ru.belogurow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/">1443. Minimum Time to Collect All Apples in a Tree</a>
 */
public class Solution1443 {

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer, Integer> vertexToParent = new HashMap<>();

        int[] processedEdges = new int[edges.length];
        for (int i = 0, len = n - 1; i < len; ) {
            for (int j = 0; j < len; j++) {
                if (processedEdges[j] == 1) {
                    continue;
                }
                int[] edge = edges[j];

                if (edge[0] == 0 || vertexToParent.containsKey(edge[0])) {
                    vertexToParent.put(edge[1], edge[0]);
                } else if (edge[1] == 0 || vertexToParent.containsKey(edge[1])) {
                    vertexToParent.put(edge[0], edge[1]);
                }

                processedEdges[j] = 1;
                i++;
            }
        }

        Set<Integer> visitedVertex = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (hasApple.get(i)) {
                int currentVertex = i;

                while (currentVertex != 0) {
                    visitedVertex.add(currentVertex);
                    currentVertex = vertexToParent.get(currentVertex);
                }
            }
        }

        return visitedVertex.size() * 2;
    }
}
