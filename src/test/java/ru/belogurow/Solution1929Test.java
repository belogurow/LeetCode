package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1929Test {

    private final Solution1929 solution = new Solution1929();

    @Test
    void getConcatenation_VerifyAnswer() {
        int[] input = new int[]{1, 2, 1};

        Assertions.assertThat(solution.getConcatenation(input))
                .containsExactly(1, 2, 1, 1, 2, 1);
    }
}