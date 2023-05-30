package ru.belogurow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution0705Test {

  @Test
  void verifyMyHashSet() {
    Solution0705.MyHashSet myHashSet = new Solution0705.MyHashSet();

    myHashSet.add(1);
    myHashSet.add(2);

    assertThat(myHashSet.contains(1))
        .isTrue();

    assertThat(myHashSet.contains(2))
        .isTrue();

    myHashSet.remove(2);

    assertThat(myHashSet.contains(2))
        .isFalse();
  }
}