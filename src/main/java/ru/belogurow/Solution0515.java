package ru.belogurow;

import ru.belogurow.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/find-largest-value-in-each-tree-row/">515. Find Largest Value in Each Tree Row</a>
 */
public class Solution0515 {

    List<Integer> res;

    public List<Integer> largestValues(TreeNode root) {
        res = new ArrayList<>();
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode treeNode, int currentHeight) {
        if (treeNode == null) {
            return;
        }

        if (res.size() <= currentHeight) {
            res.add(treeNode.val);
        } else {
            res.set(currentHeight, Math.max(res.get(currentHeight), treeNode.val));
        }

        dfs(treeNode.left, currentHeight + 1);
        dfs(treeNode.right, currentHeight + 1);
    }
}
