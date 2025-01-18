package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1368Test {

    private final Solution1368 solution = new Solution1368();

    @Test
    void verifySolution() {
        int[][] grid = {{1, 2}, {4, 3}};
        assertThat(solution.minCost(grid))
                .isEqualTo(1);
    }
}