package ru.belogurow;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/count-good-nodes-in-binary-tree/">1448. Count Good Nodes in Binary Tree</a>
 */
public class Solution1448 {

    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, Integer maxParent) {
        if (node == null) {
            return 0;
        }

        Integer newMaxParent = Math.max(node.val, maxParent);
        return dfs(node.left, newMaxParent) + dfs(node.right, newMaxParent) + (maxParent <= node.val ? 1 : 0);
    }
}
