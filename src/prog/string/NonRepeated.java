package prog.string;

import java.util.*;

public class NonRepeated {

	public static void main(String[] args) {
		System.out.println(firstNonRepeatingCharWithRegex("aaabbccddeefffggq"));
	}

	public static char firstNonRepeatingCharWithRegex(String word) {
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (!word.matches("(.*?)" + letter + "(.*?)" + letter + "(.*?)")) {
				return letter;
			}
		}
		return ' ';
	}

	/*
	 * Finds first non repeated character in a String in just one pass. It uses
	 * two storage to cut down one iteration, standard space vs time
	 * trade-off.Since we store repeated and non-repeated character separately,
	 * at the end of iteration, first element from List is our first non
	 * repeated character from String.
	 */
	public static char firstNonRepeatingChar(String word) {
		Set<Character> repeating = new HashSet<Character>();
		List<Character> nonRepeating = new ArrayList<Character>();
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (repeating.contains(letter)) {
				continue;
			}
			if (nonRepeating.contains(letter)) {
				nonRepeating.remove((Character) letter);
				repeating.add(letter);
			} else {
				nonRepeating.add(letter);
			}
		}
		return nonRepeating.get(0);
	}

	/*
	 * Using HashMap to find first non-repeated character from String in Java.
	 * Algorithm : Step 1 : Scan String and store count of each character in
	 * HashMap Step 2 : traverse String and get count for each character from
	 * Map. Since we are going through String from first to last character, when
	 * count for any character is 1, we break, it's the first non repeated
	 * character. Here order is achieved by going through String again.
	 */
	public static char firstNonRepeatedCharacter(String word) {
		HashMap<Character, Integer> scoreboard = new HashMap<Character, Integer>();
		// build table [char -> count]
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (scoreboard.containsKey(c)) {
				scoreboard.put(c, scoreboard.get(c) + 1);
			} else {
				scoreboard.put(c, 1);
			}
		}
		// since HashMap doesn't maintain order, going through string again
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (scoreboard.get(c) == 1) {
				return c;
			}
		}
		throw new RuntimeException("Undefined behaviour");
	}

}
