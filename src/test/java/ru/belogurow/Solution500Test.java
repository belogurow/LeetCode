package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution500Test {

    private final Solution500 solution = new Solution500();

    @Test
    void findWords_VerifyAnswer() {
        String[] input = new String[]{"Hello", "Alaska", "Dad", "Peace"};

        Assertions.assertThat(solution.findWords(input))
                .containsExactly("Alaska", "Dad");
    }
}