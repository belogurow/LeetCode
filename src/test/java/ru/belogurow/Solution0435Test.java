package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0435Test {

    private final Solution0435 solution = new Solution0435();

    @Test
    void verifyAnswer1() {
        int[][] intervals = new int[][]{{1, 100}, {11, 22}, {1, 11}, {2, 12}};

        assertThat(solution.eraseOverlapIntervals(intervals))
                .isEqualTo(2);
    }
}