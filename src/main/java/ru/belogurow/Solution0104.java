package ru.belogurow;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">104. Maximum Depth of Binary Tree</a>
 */
public class Solution0104 {

    public int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return Math.max(maxDepth(node.left) + 1, maxDepth(node.right) + 1);
    }
}
