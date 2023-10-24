package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">122. Best Time to Buy and Sell Stock II</a>
 */
public class Solution0122 {

	public int maxProfit(int[] prices) {
		int profit = 0;

		for (int i = 1; i < prices.length; i++) {
			int currentProfit = prices[i] - prices[i - 1];

			if (currentProfit > 0) {
				profit += currentProfit;
			}
		}

		return profit;
	}
}
