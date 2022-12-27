package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2482Test {

    private final Solution2482 solution = new Solution2482();

    @Test
    void onesMinusZeros_VerifyAnswer() {
        int[][] input = new int[][]{{0, 1, 1}, {1, 0, 1}, {0, 0, 1}};

        Assertions.assertThat(solution.onesMinusZeros(input))
                .isEqualTo(new int[][]{{0, 0, 4}, {0, 0, 4}, {-2, -2, 2}});
    }
}