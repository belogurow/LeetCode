package ru.belogurow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/finding-the-users-active-minutes/">1817. Finding the Users Active Minutes</a>
 */
public class Solution1817 {

	public int[] findingUsersActiveMinutes(int[][] logs, int k) {
		int[] ans = new int[k];

		Map<Integer, Set<Integer>> userToMinutes = new HashMap<>();

		for (int[] log : logs) {
			int user = log[0];
			int minute = log[1];

			userToMinutes.computeIfAbsent(user, key -> new HashSet<>()).add(minute);
		}

		for (Set<Integer> minutes : userToMinutes.values()) {
			ans[minutes.size() - 1] += 1;
		}

		return ans;
	}
}
