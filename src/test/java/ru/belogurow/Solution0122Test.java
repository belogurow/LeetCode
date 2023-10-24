package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0122Test {

    private final Solution0122 solution = new Solution0122();

    @Test
    void verifySolution() {
        int[] prices = new int[]{2, 1, 2, 0, 1};

        assertThat(solution.maxProfit(prices))
                .isEqualTo(2);
    }

    @Test
    void verifySolution2() {
        int[] prices = new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0};

        assertThat(solution.maxProfit(prices))
                .isEqualTo(15);
    }
}