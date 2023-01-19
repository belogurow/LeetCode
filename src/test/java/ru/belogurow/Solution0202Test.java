package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0202Test {

    private final Solution0202 solution = new Solution0202();

    @Test
    void isHappy_VerifyAnswer() {
        Assertions.assertThat(solution.isHappy(2))
                .isFalse();
    }
}