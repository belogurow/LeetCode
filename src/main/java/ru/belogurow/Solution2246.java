package ru.belogurow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/longest-path-with-different-adjacent-characters/">2246. Longest Path With Different Adjacent Characters</a>
 */
public class Solution2246 {

    private int longestPath = 1;

    public int longestPath(int[] parent, String s) {
        Map<Integer, List<Integer>> childs = new HashMap<>();

        for (int i = 1; i < parent.length; i++) {
            childs.computeIfAbsent(parent[i], k -> new ArrayList<>())
                    .add(i);
        }

        recursive(0, childs, s.toCharArray());

        return longestPath;
    }

    private int recursive(int node, Map<Integer, List<Integer>> childs, char[] nodeChars) {
        if (!childs.containsKey(node)) {
            return 1; // path of leaf
        }

        int firstMaxLength = 0, secondMaxLength = 0;

        for (Integer childNode : childs.get(node)) {
            int childMaxLength = recursive(childNode, childs, nodeChars);

            if (nodeChars[childNode] == nodeChars[node]) {
                continue;
            }

            if (childMaxLength >= firstMaxLength) {
                secondMaxLength = firstMaxLength;
                firstMaxLength = childMaxLength;
            } else if (childMaxLength > secondMaxLength) {
                secondMaxLength = childMaxLength;
            }

        }

        // choose the 2 higher paths
        longestPath = Math.max(longestPath, firstMaxLength + 1 + secondMaxLength);

        return firstMaxLength + 1; // choose the longest child path + current node
    }
}
