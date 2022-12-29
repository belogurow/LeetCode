package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1310Test {

    private final Solution1310 solution = new Solution1310();

    @Test
    void xorQueries_VerifyAnswer() {
        int[] arr = new int[]{1, 3, 4, 8};
        int[][] queries = new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}};

        Assertions.assertThat(solution.xorQueries(arr, queries))
                .containsExactly(2, 7, 14, 8);
    }

    @Test
    void xorQueries_VerifyAnswer2() {
        int[] arr = new int[]{16};
        int[][] queries = new int[][]{{0, 0}, {0, 0}, {0, 0}};

        Assertions.assertThat(solution.xorQueries(arr, queries))
                .containsExactly(16, 16, 16);
    }
}