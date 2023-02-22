package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/bulls-and-cows/description/">299. Bulls and Cows</a>
 */
public class Solution0299 {

	public String getHint(String secret, String guess) {
		int[] secretFreq = new int[10];
		int[] guessFreq = new int[10];

		int bulls = 0;
		for (int i = 0, len = secret.length(); i < len; i++) {
			int secretNum = secret.charAt(i) - '0';
			int guessNum = guess.charAt(i) - '0';

			if (secretNum == guessNum) {
				bulls += 1;
			} else {
				secretFreq[secret.charAt(i) - '0'] += 1;
				guessFreq[guess.charAt(i) - '0'] += 1;
			}
		}

		int cows = 0;
		for (int i = 0; i < 10; i++) {
			if (secretFreq[i] > 0 && guessFreq[i] > 0) {
				cows += Math.min(secretFreq[i], guessFreq[i]);
			}
		}

		return bulls + "A" + cows + "B";
	}
}
