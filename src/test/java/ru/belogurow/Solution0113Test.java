package ru.belogurow;

import org.junit.jupiter.api.Test;
import ru.belogurow.common.TreeNode;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0113Test {

    private final Solution0113 solution = new Solution0113();

    @Test
    void verifyAnswer() {
        final TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                new TreeNode(5),
                                new TreeNode(1))));

        assertThat(solution.pathSum(root, 22))
                .containsExactly(List.of(5, 4, 11, 2), List.of(5, 8, 4, 5));
    }
}