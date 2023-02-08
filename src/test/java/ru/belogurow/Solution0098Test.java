package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.belogurow.common.TreeNode;

class Solution0098Test {

	private final Solution0098 solution = new Solution0098();

	@Test
	void isValidBST_VerifyAnswer() {
		TreeNode root =
				new TreeNode(5,
						new TreeNode(4),
						new TreeNode(6,
								new TreeNode(3),
								new TreeNode(7)));

		Assertions.assertThat(solution.isValidBST(root))
				.isFalse();
	}

	@Test
	void isValidBST_VerifyAnswer2() {
		TreeNode root =
				new TreeNode(2,
						new TreeNode(1),
						new TreeNode(3));

		Assertions.assertThat(solution.isValidBST(root))
				.isTrue();
	}
}