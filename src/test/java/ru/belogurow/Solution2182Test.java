package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution2182Test {

    private final Solution2182 solution = new Solution2182();

    @Test
    void repeatLimitedString() {
        assertThat(solution.repeatLimitedString("cczazcc", 3))
                .isEqualTo("zzcccac");
    }

    @Test
    void repeatLimitedString2() {
        assertThat(solution.repeatLimitedString("aababab", 2))
                .isEqualTo("bbabaa");
    }
}