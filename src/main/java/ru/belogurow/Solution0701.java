package ru.belogurow;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="701. Insert into a Binary Search Tree">701. Insert into a Binary Search Tree</a>
 */
public class Solution0701 {

	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}

		dfs(null, root, val);
		return root;
	}

	private void dfs(TreeNode prev, TreeNode node, int val) {
		if (node == null) {
			if (val > prev.val) {
				prev.right = new TreeNode(val);
			} else {
				prev.left = new TreeNode(val);
			}
			return;
		}

		if (val > node.val) {
			dfs(node, node.right, val);
		} else {
			dfs(node, node.left, val);
		}
	}
}
