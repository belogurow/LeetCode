package ru.belogurow;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/design-hashset/">705. Design HashSet</a>
 */
public class Solution0705 {

  public static class MyHashSet {

    private final float loadFactor = 0.75f;
    private List<Integer>[] buckets;
    private int size;
    private int currentCapacity = 1024;

    public MyHashSet() {
      this.buckets = new List[currentCapacity];
      this.size = 0;
    }

    public void add(int key) {
      if (contains(key)) {
        return;
      }

      if (size > currentCapacity * loadFactor) {
        resize();
      }

      int hash = hash(key);
      if (buckets[hash] == null) {
        buckets[hash] = new LinkedList<>();
      }

      buckets[hash].add(key);
      size++;
    }

    public void remove(int key) {
      if (!contains(key)) {
        return;
      }

      List<Integer> bucket = buckets[hash(key)];
      bucket.remove((Integer) key); // we need remove by object -> cast primitive to object
      size--;
    }

    public boolean contains(int key) {
      List<Integer> bucket = buckets[hash(key)];
      return bucket != null && bucket.contains(key);
    }

    private int hash(int key) {
      return key % currentCapacity;
    }

    private void resize() {
      List<Integer>[] prevBuckets = buckets;
      currentCapacity *= 2;
      size = 0;
      buckets = new List[currentCapacity];
      for (List<Integer> bucket : prevBuckets) {
        if (bucket == null) {
          continue;
        }

        for (int key : bucket) {
          add(key);
        }
      }
    }
  }
}
