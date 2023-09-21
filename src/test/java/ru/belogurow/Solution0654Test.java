package ru.belogurow;

import org.junit.jupiter.api.Test;
import ru.belogurow.common.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0654Test {

    private final Solution0654 solution = new Solution0654();

    @Test
    void verifySolution() {
        int[] nums = new int[]{3, 2, 1, 6, 0, 5};

        TreeNode result = new TreeNode(6,
                new TreeNode(3,
                        null,
                        new TreeNode(2,
                                null,
                                new TreeNode(1))),
                new TreeNode(5,
                        new TreeNode(0),
                        null));

        assertThat(solution.constructMaximumBinaryTree(nums))
                .isEqualTo(result);
    }
}