package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0763Test {

    private final Solution0763 solution = new Solution0763();

    @Test
    void verifyAnswer1() {
        final var s = "eaaaabaaec";

        assertThat(solution.partitionLabels(s))
                .containsExactly(9, 1);
    }
}