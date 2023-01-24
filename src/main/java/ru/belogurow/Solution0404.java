package ru.belogurow;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/sum-of-left-leaves/">404. Sum of Left Leaves</a>
 */
public class Solution0404 {

    public int sumOfLeftLeaves(TreeNode node) {
        if (node == null) {
            return 0;
        }

        if (node.left != null && node.left.left == null && node.left.right == null) {
            return node.left.val + sumOfLeftLeaves(node.right);
        }

        return sumOfLeftLeaves(node.left) + sumOfLeftLeaves(node.right);
    }
}
