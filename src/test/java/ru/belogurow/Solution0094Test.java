package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.belogurow.common.TreeNode;

class Solution0094Test {

	private final Solution0094 solution = new Solution0094();

	@Test
	void inorderTraversal_VerifyAnswer() {
		TreeNode root =
				new TreeNode(1,
						new TreeNode(2,
								new TreeNode(4),
								new TreeNode(5)),
						new TreeNode(3,
								new TreeNode(6),
								null));

		Assertions.assertThat(solution.inorderTraversal(root))
				.containsExactly(4, 2, 5, 1, 6, 3);

	}
}