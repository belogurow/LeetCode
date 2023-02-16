package ru.belogurow;

import ru.belogurow.common.TreeNode;

import java.util.Stack;

/**
 * @see <a href="hhttps://leetcode.com/problems/range-sum-of-bst/">938. Range Sum of BST</a>
 */
public class Solution0938 {

	public int rangeSumBST(TreeNode root, int low, int high) {
		int sum = 0;

		Stack<TreeNode> nodes = new Stack<>();
		nodes.add(root);

		while (!nodes.isEmpty()) {
			TreeNode node = nodes.pop();

			if (node != null) {
				if (low <= node.val && node.val <= high) {
					sum += node.val;
				}

				if (node.val < high) {
					nodes.push(node.right);
				}

				if (low < node.val) {
					nodes.push(node.left);
				}
			}
		}


		return sum;
	}
}
