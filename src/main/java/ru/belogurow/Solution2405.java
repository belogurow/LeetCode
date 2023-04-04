package ru.belogurow;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/optimal-partition-of-string/">2405. Optimal Partition of String</a>
 */
public class Solution2405 {

	public int partitionString(String s) {
		char[] chars = s.toCharArray();

		Set<Character> currentPartition = new HashSet<>();
		int partitionsCount = 0;
		for (char ch : chars) {
			if (currentPartition.contains(ch)) {
				currentPartition.clear();
				partitionsCount += 1;
			}

			currentPartition.add(ch);
		}

		return partitionsCount + 1; // add last currentPartition
	}
}
