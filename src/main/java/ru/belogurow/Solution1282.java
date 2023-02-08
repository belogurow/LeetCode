package ru.belogurow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/">1282. Group the People Given the Group Size They Belong To</a>
 */
public class Solution1282 {

	public List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> ans = new ArrayList<>();

		Map<Integer, List<Integer>> sizeToGroup = new HashMap<>();

		for (int i = 0; i < groupSizes.length; i++) {
			int groupSize = groupSizes[i];

			List<Integer> group = sizeToGroup.getOrDefault(groupSize, new ArrayList<>());

			group.add(i);
			if (group.size() == groupSize) {
				ans.add(group);
				sizeToGroup.remove(groupSize);
			} else {
				sizeToGroup.put(groupSize, group);
			}
		}

		return ans;
	}
}
