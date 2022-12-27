package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1828Test {

    private final Solution1828 solution = new Solution1828();

    @Test
    void countPoints_VerifyAnswer() {
        int[][] points = new int[][]{{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = new int[][]{{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};

        Assertions.assertThat(solution.countPoints(points, queries))
                .containsExactly(3, 2, 2);
    }
}