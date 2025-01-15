package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class Solution2429Test {

    private final Solution2429 solution = new Solution2429();

    @Test
    void verifySolution1() {
        assertThat(solution.minimizeXor(3, 5))
                .isEqualTo(3);
    }

    @Test
    void verifySolution2() {
        assertThat(solution.minimizeXor(1, 12))
                .isEqualTo(3);
    }
}