package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0807Test {

    private final Solution0807 solution = new Solution0807();

    @Test
    void maxIncreaseKeepingSkyline_VerifyAnswer() {
        int[][] input = new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7,}, {9, 2, 6, 3}, {0, 3, 1, 0}};

        Assertions.assertThat(solution.maxIncreaseKeepingSkyline(input))
                .isEqualTo(35);
    }
}