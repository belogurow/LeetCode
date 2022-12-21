package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1672Test {

    private final Solution1672 solution = new Solution1672();

    @Test
    void maximumWealth_VerifyAnswer() {
        int[][] input = new int[][]{{1, 5}, {7, 3}, {3, 5}};

        Assertions.assertThat(solution.maximumWealth(input))
                .isEqualTo(10);
    }

}