package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2114Test {

    private final Solution2114 solution = new Solution2114();

    @Test
    void mostWordFound_VerifyAnswer() {
        String[] input = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        Assertions.assertThat(solution.mostWordsFound(input))
                .isEqualTo(6);
    }
}