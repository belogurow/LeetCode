package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1266Test {

    private final Solution1266 solution = new Solution1266();

    @Test
    void minTimeToVisitAllPoints_VerifyAnswer() {
        int[][] input = new int[][]{{1, 1}, {3, 4}, {-1, 0}};

        Assertions.assertThat(solution.minTimeToVisitAllPoints(input))
                .isEqualTo(7);
    }
}