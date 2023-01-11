package ru.belogurow;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1443Test {

    private final Solution1443 solution = new Solution1443();

    @Test
    void minTime_VerifyAnswer() {
        int n = 7;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}};
        List<Boolean> hasApple = List.of(false, false, true, false, true, true, false);

        Assertions.assertThat(solution.minTime(n, edges, hasApple))
                .isEqualTo(8);
    }

    @Test
    void minTime_VerifyAnswer2() {
        int n = 4;
        int[][] edges = new int[][]{{0, 2}, {0, 3}, {1, 2}};
        List<Boolean> hasApple = List.of(false, true, false, false);

        Assertions.assertThat(solution.minTime(n, edges, hasApple))
                .isEqualTo(4);
    }

    @Test
    void minTime_VerifyAnswer3() {
        int n = 4;
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {0, 3}};
        List<Boolean> hasApple = List.of(true, true, true, true);

        Assertions.assertThat(solution.minTime(n, edges, hasApple))
                .isEqualTo(6);
    }
}