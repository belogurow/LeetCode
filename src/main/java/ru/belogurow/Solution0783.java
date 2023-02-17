package ru.belogurow;

import ru.belogurow.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/minimum-distance-between-bst-nodes/">783. Minimum Distance Between BST Nodes</a>
 */
public class Solution0783 {

	public int minDiffInBST(TreeNode root) {
		List<Integer> vals = new LinkedList<>();
		bfs(root, vals);

		int minDiff = Integer.MAX_VALUE;
		for (int i = 1; i < vals.size(); i++) {
			minDiff = Math.min(minDiff, vals.get(i) - vals.get(i - 1));
		}

		return minDiff;
	}

	public void bfs(TreeNode node, List<Integer> vals) {
		if (node == null) {
			return;
		}

		bfs(node.left, vals);
		vals.add(node.val);
		bfs(node.right, vals);
	}
}
