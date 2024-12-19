package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/">1475. Final Prices With a Special Discount in a Shop</a>
 */
public class Solution1475 {

	public int[] finalPrices(int[] prices) {
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] <= prices[i]) {
					prices[i] -= prices[j];
					break;
				}
			}
		}

		return prices;
	}
}
