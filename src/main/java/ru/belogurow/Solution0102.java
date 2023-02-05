package ru.belogurow;

import ru.belogurow.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/">102. Binary Tree Level Order Traversal</a>
 */
public class Solution0102 {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		dfs(root, 0, ans);
		return ans;
	}

	private void dfs(TreeNode node, int level, List<List<Integer>> ans) {
		if (node == null) {
			return;
		}

		List<Integer> vals;
		if (ans.size() - 1 < level) {
			vals = new ArrayList<>();
			ans.add(vals);
		} else {
			vals = ans.get(level);
		}

		vals.add(node.val);

		dfs(node.left, level + 1, ans);
		dfs(node.right, level + 1, ans);
	}
}
