package ru.belogurow;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/pascals-triangle/">118. Pascal's Triangle</a>
 */
public class Solution0118 {

	public List<List<Integer>> generate(int numRows) {
		if (numRows == 1) {
			List<List<Integer>> tree = new ArrayList<>();
			tree.add(List.of(1));
			return tree;
		}

		if (numRows == 2) {
			List<List<Integer>> tree = generate(numRows - 1);
			tree.add(List.of(1, 1));
			return tree;
		}

		List<List<Integer>> tree = generate(numRows - 1);
		List<Integer> lastRow = tree.get(tree.size() - 1);
		List<Integer> newRow = new ArrayList<>();
		newRow.add(1);
		for (int i = 1; i < lastRow.size(); i++) {
			newRow.add(lastRow.get(i - 1) + lastRow.get(i));
		}
		newRow.add(1);
		tree.add(newRow);
		return tree;
	}
}
