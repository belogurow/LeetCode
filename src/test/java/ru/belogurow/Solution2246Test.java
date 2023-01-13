package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2246Test {

    private final Solution2246 solution = new Solution2246();

    @Test
    void longestPath_VerifyAnswer() {
        int[] parent = {-1, 0, 0, 1, 1, 2};

        Assertions.assertThat(solution.longestPath(parent, "abacbe"))
                .isEqualTo(3);
    }

    @Test
    void longestPath_VerifyAnswer2() {
        int[] parent = {-1, 0, 0, 0};

        Assertions.assertThat(solution.longestPath(parent, "aabc"))
                .isEqualTo(3);
    }

    @Test
    void longestPath_VerifyAnswer3() {
        int[] parent = {-1, 0, 1};

        Assertions.assertThat(solution.longestPath(parent, "aab"))
                .isEqualTo(2);
    }

    @Test
    void longestPath_VerifyAnswer4() {
        int[] parent = {-1, 0, 1, 2, 3, 4};

        Assertions.assertThat(solution.longestPath(parent, "zzabab"))
                .isEqualTo(5);
    }

    @Test
    void longestPath_VerifyAnswer_TreeHasOnlyRoot() {
        int[] parent = {-1};

        Assertions.assertThat(solution.longestPath(parent, "a"))
                .isEqualTo(1);
    }

    @Test
    void longestPath_VerifyAnswer_TreeHasTwoNodesAndSameSymbols() {
        int[] parent = {-1, 0};

        Assertions.assertThat(solution.longestPath(parent, "aa"))
                .isEqualTo(1);
    }

    @Test
    void longestPath_VerifyAnswer_TreeHasTwoNodesAndDifferentSymbols() {
        int[] parent = {-1, 0};

        Assertions.assertThat(solution.longestPath(parent, "ab"))
                .isEqualTo(2);
    }
}