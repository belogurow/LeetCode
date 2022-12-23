package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1051Test {

    private final Solution1051 solution = new Solution1051();

    @Test
    void heightChecker_VerifyAnswer() {
        int[] input = new int[]{1, 1, 4, 2, 1, 3};

        Assertions.assertThat(solution.heightChecker(input))
                .isEqualTo(3);
    }
}