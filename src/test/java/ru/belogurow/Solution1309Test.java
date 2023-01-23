package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1309Test {

    private final Solution1309 solution = new Solution1309();

    @Test
    void freqAlphabets_VerifyAnswer() {
        Assertions.assertThat(solution.freqAlphabets("10#11#12"))
                .isEqualTo("jkab");
    }
}