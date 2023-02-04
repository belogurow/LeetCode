package ru.belogurow;

import ru.belogurow.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">94. Binary Tree Inorder Traversal</a>
 */
public class Solution0094 {

	public List<Integer> inorderTraversal(TreeNode node) {
		return iterative(node);
	}

	private List<Integer> iterative(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;
		while (curr != null || !stack.isEmpty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			res.add(curr.val);
			curr = curr.right;
		}
		return res;
	}

	private List<Integer> recursive(TreeNode node) {
		if (node == null) {
			return new ArrayList<>();
		}

		List<Integer> vals = inorderTraversal(node.left);
		vals.add(node.val);
		vals.addAll(inorderTraversal(node.right));

		return vals;
	}
}
