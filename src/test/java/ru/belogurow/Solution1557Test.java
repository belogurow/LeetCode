package ru.belogurow;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1557Test {

  private final Solution1557 solution = new Solution1557();

  @Test
  void findSmallestSetOfVertices() {
    List<List<Integer>> edges = List.of(
        List.of(0, 1),
        List.of(2, 1),
        List.of(3, 1),
        List.of(1, 4),
        List.of(2, 4));

    Assertions.assertThat(solution.findSmallestSetOfVertices(5, edges))
        .hasSize(3)
        .contains(0, 2, 3);
  }
}