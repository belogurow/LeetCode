package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1720Test {

    private final Solution1720 solution = new Solution1720();

    @Test
    void decode_VerifyAnswer() {
        int[] input = new int[]{6, 2, 7, 3};

        Assertions.assertThat(solution.decode(input, 4))
                .containsExactly(4, 2, 0, 7, 4);
    }
}