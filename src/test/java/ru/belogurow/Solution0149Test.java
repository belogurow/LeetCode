package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0149Test {

    private final Solution0149 solution = new Solution0149();

    @Test
    void maxPoints_VerifyAnswer() {
        int[][] points = new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};

        Assertions.assertThat(solution.maxPoints(points))
                .isEqualTo(4);
    }

    @Test
    void maxPoints_VerifyAnswer2() {
        int[][] points = new int[][]{{1, 1}, {2, 2}, {3, 3}};

        Assertions.assertThat(solution.maxPoints(points))
                .isEqualTo(3);
    }
}