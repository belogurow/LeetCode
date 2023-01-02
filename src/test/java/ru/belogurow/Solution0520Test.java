package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0520Test {

    private final Solution0520 solution = new Solution0520();

    @Test
    void detectCapitalUse_AllCapitals() {
        Assertions.assertThat(solution.detectCapitalUse("USA"))
                .isTrue();
    }

    @Test
    void detectCapitalUse_AllNotCapitals() {
        Assertions.assertThat(solution.detectCapitalUse("usa"))
                .isTrue();
    }

    @Test
    void detectCapitalUse_FirstCapital() {
        Assertions.assertThat(solution.detectCapitalUse("Usa"))
                .isTrue();
    }

    @Test
    void detectCapitalUse_WrongCapitalUsage() {
        Assertions.assertThat(solution.detectCapitalUse("UsA"))
                .isFalse();
    }
}