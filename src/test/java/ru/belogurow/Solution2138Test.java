package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution2138Test {

    private final Solution2138 solution = new Solution2138();

    @Test
    void divideString_VerifyAnswer() {
        assertThat(solution.divideString("abcdefghi", 3, 'x'))
                .containsExactly("abc", "def", "ghi");
    }

    @Test
    void divideString_VerifyAnswer2() {
        assertThat(solution.divideString("abcdefghij", 3, 'x'))
                .containsExactly("abc", "def", "ghi", "jxx");
    }
}