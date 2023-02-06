package ru.belogurow;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/path-sum/description/">112. Path Sum</a>
 */
public class Solution0112 {

	public boolean hasPathSum(TreeNode node, int targetSum) {
		if (node == null) {
			return false;
		} else if (node.left == null && node.right == null && node.val == targetSum) { // if leaf
			return true;
		}

		return hasPathSum(node.left, targetSum - node.val) || hasPathSum(node.right, targetSum - node.val);
	}
}
