package ru.belogurow;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/">1557. Minimum Number of Vertices to Reach All Nodes</a>
 */
public class Solution1557 {

  public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
    int[] isChildNode = new int[n];

    for (List<Integer> edge : edges) {
      isChildNode[edge.get(1)] = 1;
    }

    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (isChildNode[i] == 0) {
        res.add(i);
      }
    }

    return res;
  }
}
