package ru.belogurow;

/**
 * @see <a href="https://leetcode.com/problems/decode-string/">394. Decode String</a>
 */
public class Solution0394 {

	public String decodeString(String s) {
		return extractFromBrackets(1, s);
	}

	private String extractFromBrackets(int repeatCount, String str) {
		StringBuilder sb = new StringBuilder();

		int newRepeatCount = 0;
		for (int i = 0, len = str.length(); i < len; i++) {
			char c = str.charAt(i);

			if (c == '[') {
				StringBuilder newRepeatedSb = new StringBuilder();
				int bracketCount = 1;
				int j = i + 1;
				while (bracketCount != 0) {
					c = str.charAt(j);
					if (c == '[') {
						bracketCount += 1;
					} else if (c == ']') {
						bracketCount -= 1;
					}

					newRepeatedSb.append(c);
					j++;
				}
				newRepeatedSb.deleteCharAt(newRepeatedSb.length() - 1); // remove last ']'
				sb.append(extractFromBrackets(newRepeatCount, newRepeatedSb.toString()));
				newRepeatCount = 0;
				i = j - 1;
			} else if (Character.isDigit(c)) {
				newRepeatCount = newRepeatCount * 10 + (c - '0');
			} else {
				sb.append(c);
			}
		}

		return sb.toString().repeat(repeatCount);
	}
}
