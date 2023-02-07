package ru.belogurow;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/search-in-a-binary-search-tree/">700. Search in a Binary Search Tree</a>
 */
public class Solution0700 {

	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return null;
		}

		if (root.val == val) {
			return root;
		} else if (val > root.val) {
			return searchBST(root.right, val);
		} else {
			return searchBST(root.left, val);
		}
	}
}
