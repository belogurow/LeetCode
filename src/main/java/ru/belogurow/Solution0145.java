package ru.belogurow;

import ru.belogurow.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-postorder-traversal/">145. Binary Tree Postorder Traversal</a>
 */
public class Solution0145 {

	public List<Integer> postorderTraversal(TreeNode node) {
		if (node == null) {
			return new ArrayList<>();
		}

		List<Integer> vals = new ArrayList<>();
		vals.addAll(postorderTraversal(node.left));
		vals.addAll(postorderTraversal(node.right));
		vals.add(node.val);

		return vals;
	}
}
