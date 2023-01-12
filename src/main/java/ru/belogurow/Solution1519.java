package ru.belogurow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label/">1519. Number of Nodes in the Sub-Tree With the Same Label</a>
 */
public class Solution1519 {

    public int[] countSubTrees(int n, int[][] edges, String labels) {
        Map<Integer, List<Integer>> childs = new HashMap<>();

        int[] usedEdges = new int[n];
        for (int i = 0; i < n - 1; ) {
            for (int[] edge : edges) {
                if (edge[0] == 0 || usedEdges[edge[0]] == 1) {
                    childs.computeIfAbsent(edge[0], v -> new ArrayList<>())
                            .add(edge[1]);
                    usedEdges[edge[1]] = 1;
                    i++;
                } else if (edge[1] == 0 || usedEdges[edge[1]] == 1) {
                    childs.computeIfAbsent(edge[1], v -> new ArrayList<>())
                            .add(edge[0]);
                    usedEdges[edge[0]] = 1;
                    i++;
                }
            }
        }

        char[] labelsArray = labels.toCharArray();

        int[] ans = new int[n];
        subTreesRecursive(0, -1, childs, labelsArray, ans);
        return ans;
    }

    private int[] subTreesRecursive(int node, int parent, Map<Integer, List<Integer>> childs, char[] labelsArray, int[] ans) {
        int c = labelsArray[node] - 97;
        int[] charsCount = new int[26];
        charsCount[c] += 1;

        if (childs.containsKey(node)) {
            for (Integer childNode : childs.get(node)) {
                int[] newCharsCount = subTreesRecursive(childNode, node, childs, labelsArray, ans);

                for (int i = 0; i < 26; i++) {
                    charsCount[i] += newCharsCount[i];
                }
            }
        }

        ans[node] = charsCount[c];

        return charsCount;
    }
}
