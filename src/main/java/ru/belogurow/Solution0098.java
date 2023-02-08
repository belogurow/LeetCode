package ru.belogurow;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/validate-binary-search-tree/">98. Validate Binary Search Tree</a>
 */
public class Solution0098 {

	public boolean isValidBST(TreeNode root) {
		return dfs(root, null, null);
	}

	private boolean dfs(TreeNode node, Integer low, Integer high) {
		if (node == null) {
			return true;
		}

		if (low != null && node.val <= low) {
			return false;
		}

		if (high != null && node.val >= high) {
			return false;
		}

		return dfs(node.left, low, node.val) && dfs(node.right, node.val, high);
	}
}
