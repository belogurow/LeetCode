package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1232Test {

    private final Solution1232 solution = new Solution1232();

    @Test
    void checkStraightLine_VerifyAnswer() {
        int[][] coordinates = new int[][]{{0, 0}, {0, 1}, {0, -1}};

        Assertions.assertThat(solution.checkStraightLine(coordinates))
                .isTrue();
    }

    @Test
    void checkStraightLine_VerifyAnswer2() {
        int[][] coordinates = new int[][]{{2, 1}, {4, 2}, {6, 3}};

        Assertions.assertThat(solution.checkStraightLine(coordinates))
                .isTrue();
    }

    @Test
    void checkStraightLine_VerifyAnswer3() {
        int[][] coordinates = new int[][]{{2, 4}, {2, 5}, {2, 8}};

        Assertions.assertThat(solution.checkStraightLine(coordinates))
                .isTrue();
    }

    @Test
    void checkStraightLine_VerifyAnswer4() {
        int[][] coordinates = new int[][]{{-3, -2}, {-1, -2}, {2, -2}, {-2, -2}, {0, -2}};

        Assertions.assertThat(solution.checkStraightLine(coordinates))
                .isTrue();
    }
}