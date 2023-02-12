package ru.belogurow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital/">2477. Minimum Fuel Cost to Report to the Capital</a>
 */
public class Solution2477 {

	long fuelCost = 0;

	public long minimumFuelCost(int[][] roads, int seats) {
		if (roads.length == 0) {
			return 0;
		}

		Map<Integer, Set<Integer>> connectedRoads = new HashMap<>();

		for (int[] road : roads) {
			connectedRoads.computeIfAbsent(road[0], key -> new HashSet<>()).add(road[1]);
			connectedRoads.computeIfAbsent(road[1], key -> new HashSet<>()).add(road[0]);
		}

		dfsFuel(-1, 0, connectedRoads, seats);

		return fuelCost;
	}

	private long dfsFuel(int parentCity, int currentCity, Map<Integer, Set<Integer>> connectedRoads, int maxSeats) {
		long citiesCount = 1l;

		for (Integer childCity : connectedRoads.get(currentCity)) {
			if (childCity != parentCity) {
				citiesCount += dfsFuel(currentCity, childCity, connectedRoads, maxSeats);
			}
		}

		if (currentCity != 0) {
			fuelCost += Math.ceil((double) citiesCount / maxSeats);
		}

		return citiesCount;
	}
}
