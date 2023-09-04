package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0735Test {

    private final Solution0735 solution = new Solution0735();

    @Test
    void asteroidCollision_verifyAnswer() {
        int[] asteroids = {10, 2, -5};

        assertThat(solution.asteroidCollision(asteroids))
                .containsExactly(10);
    }

    @Test
    void asteroidCollision_verifyAnswer2() {
        int[] asteroids = {-2, -1, 1, 2};

        assertThat(solution.asteroidCollision(asteroids))
                .containsExactly(-2, -1, 1, 2);
    }

    @Test
    void asteroidCollision_verifyAnswer3() {
        int[] asteroids = {1,-2,-2,-2};

        assertThat(solution.asteroidCollision(asteroids))
                .containsExactly(-2, -2, -2);
    }

    @Test
    void asteroidCollision_verifyAnswer4() {
        int[] asteroids = {8, -8};

        assertThat(solution.asteroidCollision(asteroids))
                .hasSize(0);
    }
}