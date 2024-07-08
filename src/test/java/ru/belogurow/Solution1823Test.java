package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class Solution1823Test {

    private final Solution1823 solution = new Solution1823();

    @Test
    void findTheWinner_VerifyAnswer() {
        Assertions.assertThat(solution.findTheWinner(5, 2))
                .isEqualTo(3);
    }
}