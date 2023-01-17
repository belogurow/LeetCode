package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0926Test {
    
    private final Solution0926 solution = new Solution0926();

    @Test
    void minFlipsMonoIncr_VerifyAnswer() {
        Assertions.assertThat(solution.minFlipsMonoIncr("00110"))
                .isEqualTo(1);
    }

    @Test
    void minFlipsMonoIncr_VerifyAnswer2() {
        Assertions.assertThat(solution.minFlipsMonoIncr("00011000"))
                .isEqualTo(2);
    }

    @Test
    void minFlipsMonoIncr_VerifyAnswer3() {
        Assertions.assertThat(solution.minFlipsMonoIncr("1110010000100011111111111"))
                .isEqualTo(5);
    }
}