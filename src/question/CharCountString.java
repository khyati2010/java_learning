package question;

import java.util.Arrays;

public class CharCountString {

	public static void main(String[] args) {
		System.out.println(findFirstCharMaxKTimes("hello world"));
		System.out.println(findFirstCharMaxKTimes("ho lloh"));
	}

	public static char findFirstCharMaxKTimes(String s) {
		int[] charCount = new int[256];
		char[] c = s.toCharArray();
		int max = 1;
		char firstMax = c[0];
		int firstIdxOfMax = 0;
		charCount[c[0]]++;
		for (int i = 1; i < c.length; i++) {
			charCount[c[i]]++;
			if (charCount[c[i]] >= max) {
				int firstIdxChar = s.indexOf(c[i]);
				if (charCount[c[i]] > max
						|| (charCount[c[i]] == max && firstIdxChar < firstIdxOfMax)) {
					max = charCount[c[i]];
					firstMax = c[i];
					firstIdxOfMax = firstIdxChar;
				}
			}
		}
		return firstMax;
	}

	public char findMostRepeated(String s) {

		if (s.length() == 0)
			return ' ';
		char[] ch = s.toCharArray();
		int[] track = new int[256];
		Arrays.fill(track, 0);
		char out = ' ';
		int outCount = 0;
		for (int i = 0; i < s.length(); i++) {
			track[ch[i]] = track[ch[i]] + 1;
			if (outCount < track[ch[i]]) {
				outCount = track[ch[i]];
				out = ch[i];
			}

		}

		return out;
	}
}