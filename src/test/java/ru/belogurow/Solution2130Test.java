package ru.belogurow;

import org.junit.jupiter.api.Test;
import ru.belogurow.common.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

class Solution2130Test {

  private final Solution2130 solution = new Solution2130();

  @Test
  void pairSum() {
    ListNode head = ListNode.convertToNodes(5, 4, 2, 1, 3, 5);

    assertThat(solution.pairSum(head))
        .isEqualTo(10);
  }
}