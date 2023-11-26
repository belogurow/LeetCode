package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1727Test {

    private final Solution1727 solution = new Solution1727();

    @Test
    void verifyAnswer() {
        int[][] matrix = new int[][] {
                {0, 0, 1},
                {1, 1, 1},
                {1, 0, 1}};

        assertThat(solution.largestSubmatrix(matrix))
                .isEqualTo(4);
    }

    @Test
    void verifyAnswer2() {
        int[][] matrix = new int[][] {
                {0, 0, 1},
                {1, 1, 1},
                {0, 1, 0}};

        assertThat(solution.largestSubmatrix(matrix))
                .isEqualTo(3);
    }
}