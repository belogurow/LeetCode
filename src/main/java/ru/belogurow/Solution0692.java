package ru.belogurow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @see <a href="https://leetcode.com/problems/top-k-frequent-words/">692. Top K Frequent Words</a>
 */
public class Solution0692 {

	public List<String> topKFrequent(String[] words, int k) {
		Map<String, Integer> wordsFreq = new HashMap<>();
		for (String word : words) {
			wordsFreq.compute(word, (key, value) -> value == null ? 1 : value + 1);
		}

		return wordsFreq.keySet().stream()
				.sorted((o1, o2) -> {
					if (Objects.equals(wordsFreq.get(o1), wordsFreq.get(o2))) {
						return o1.compareTo(o2);
					} else {
						return Integer.compare(wordsFreq.get(o2), wordsFreq.get(o1));
					}
				})
				.limit(k)
				.toList();

	}
}
