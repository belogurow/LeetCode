package ru.belogurow;

import ru.belogurow.common.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/evaluate-boolean-binary-tree/">2331. Evaluate Boolean Binary Tree</a>
 */
public class Solution2331 {

	public boolean evaluateTree(TreeNode root) {
		if (root.left == null && root.right == null) {
			return 1 == root.val;
		}

		return root.val == 2 ?
				evaluateTree(root.left) || evaluateTree(root.right) :
				evaluateTree(root.left) && evaluateTree(root.right);
	}
}
