package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">121. Best Time to Buy and Sell Stock</a>
 */
public class Solution0121 {

	public int maxProfit(int[] prices) {
		int profit = 0;
		int min = Integer.MAX_VALUE;

		for (int price : prices) {
			if (price < min) {
				min = price;
			} else if (profit < price - min) {
				profit = price - min;
			}
		}

		return profit;
	}
}
