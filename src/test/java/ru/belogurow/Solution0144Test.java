package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import ru.belogurow.common.TreeNode;

class Solution0144Test {

    private final Solution0144 solution = new Solution0144();

    @Test
    void preorderTraversal_VerifyAnswer() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

        Assertions.assertThat(solution.preorderTraversal(root))
                .containsExactly(1, 2, 3);
    }
}