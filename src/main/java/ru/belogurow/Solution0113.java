package ru.belogurow;

import ru.belogurow.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/path-sum-ii/">113. Path Sum II</a>
 */
public class Solution0113 {


	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return List.of();
		}

		List<List<Integer>> result = dfs(root, targetSum);
		return result == null ? List.of() : result;
	}

	private List<List<Integer>> dfs(TreeNode node, int targetSum) {
		if (node == null) {
			return null;
		}

		// is leaf
		if (node.right == null && node.left == null) {
			if (targetSum == node.val) {
				List<Integer> path = new ArrayList<>();
				path.add(0, node.val);

				List<List<Integer>> pathes = new ArrayList<>();
				pathes.add(path);
				return pathes;
			} else {
				return null;
			}
		}

		List<List<Integer>> union = new ArrayList<>();

		List<List<Integer>> leftPathes = dfs(node.left, targetSum - node.val);
		if (leftPathes != null) {
			for (List<Integer> leftPath : leftPathes) {
				leftPath.add(0, node.val);
			}

			union.addAll(leftPathes);
		}

		List<List<Integer>> rightPathes = dfs(node.right, targetSum - node.val);
		if (rightPathes != null) {
			for (List<Integer> rightPath : rightPathes) {
				rightPath.add(0, node.val);
			}

			union.addAll(rightPathes);
		}

		return union;
	}
}
