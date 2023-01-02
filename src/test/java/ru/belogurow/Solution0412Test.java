package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0412Test {

    private final Solution0412 solution = new Solution0412();

    @Test
    void fizzBuzz_VerifyAnswer() {
        Assertions.assertThat(solution.fizzBuzz(15))
                .containsExactly("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
    }
}