package ru.belogurow;

import ru.belogurow.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/two-sum-iv-input-is-a-bst/">653. Two Sum IV - Input is a BST</a>
 */
public class Solution0653 {

	public boolean findTarget(TreeNode root, int k) {
		List<Integer> vals = new ArrayList<>();
		dfs(root, vals);

		for (int left = 0, right = vals.size() - 1; left < right; ) {
			int sum = vals.get(left) + vals.get(right);
			if (sum == k) {
				return true;
			} else if (sum < k) {
				left += 1;
			} else {
				right -= 1;
			}
		}

		return false;
	}

	public void dfs(TreeNode node, List<Integer> vals) {
		if (node == null) {
			return;
		}

		dfs(node.left, vals);
		vals.add(node.val);
		dfs(node.right, vals);
	}
}
