package ru.belogurow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/naming-a-company/">2306. Naming a Company</a>
 */
public class Solution2306 {

	public long distinctNames(String[] ideas) {
		long distinctNames = 0;

		Map<Character, Set<String>> firstCharToIdeas = new HashMap<>();
		for (String idea : ideas) {
			firstCharToIdeas.computeIfAbsent(idea.charAt(0), k -> new HashSet<>()).add(idea.substring(1));
		}

		for (Map.Entry<Character, Set<String>> entry1 : firstCharToIdeas.entrySet()) {
			for (Map.Entry<Character, Set<String>> entry2 : firstCharToIdeas.entrySet()) {
				if (entry1.getKey().equals(entry2.getKey())) {
					continue;
				}

				int sameWords = intersectionWords(entry1.getValue(), entry2.getValue());
				int totalWords = (entry1.getValue().size() - sameWords) * (entry2.getValue().size() - sameWords);
				distinctNames += totalWords;
			}
		}

		return distinctNames;
	}

	private int intersectionWords(Set<String> s1, Set<String> s2) {
		int intersectionWords = 0;

		for (String s : s1) {
			if (s2.contains(s)) {
				intersectionWords++;
			}
		}

		return intersectionWords;
	}
}
