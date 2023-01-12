package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1519Test {

    private final Solution1519 solution = new Solution1519();

    @Test
    void countSubTrees_VerifyAnswer() {
        int n = 7;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}};
        String labels = "abaedcd";

        Assertions.assertThat(solution.countSubTrees(n, edges, labels))
                .containsExactly(2, 1, 1, 1, 1, 1, 1);
    }

    @Test
    void countSubTrees_VerifyAnswer2() {
        int n = 5;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 3}, {0, 4}};
        String labels = "aabab";

        Assertions.assertThat(solution.countSubTrees(n, edges, labels))
                .containsExactly(3, 2, 1, 1, 1);
    }
}