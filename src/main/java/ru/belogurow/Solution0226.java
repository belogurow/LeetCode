package ru.belogurow;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/invert-binary-tree/">226. Invert Binary Tree</a>
 */
public class Solution0226 {

	public TreeNode invertTree(TreeNode root) {
		dfs(root);
		return root;
	}

	private void dfs(TreeNode node) {
		if (node == null) {
			return;
		}

		TreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;

		dfs(node.left);
		dfs(node.right);
	}
}
