package prog.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * * Java Program to find duplicate characters in String. * * *
 * 
 * @author http://java67.blogspot.com
 */
public class FindDuplicateCharacters {
	public static void main(String args[]) {
		printDuplicateCharacters("Programming");
		printDuplicateCharacters("Combination");
		printDuplicateCharacters("Java");
	}

	/* * Find all duplicate characters in a String and print each of them. */
	public static void printDuplicateCharacters(String word) {
		char[] characters = word.toCharArray();
		// build HashMap with character and number of times they appear in
		// String
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		// Iterate through HashMap to print all duplicate characters of String
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n",
				word);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(),
						entry.getValue());
			}
		}
	}

	/*
	 * Output List of duplicate characters in String 'Programming' g : 2 r : 2 m
	 * : 2 List of duplicate characters in String 'Combination' n : 2 o : 2 i :
	 * 2 List of duplicate characters in String 'Java'
	 * 
	 * Read more:
	 * http://www.java67.com/2014/03/how-to-find-duplicate-characters-in-String
	 * -Java-program.html#ixzz4YY5X44t6
	 */

	private void ShowHashMapValue() {
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("one", "a");
		map.put("two", "b");
		map.put("three", "c");
		map.put("four", "d");
		/** * get the Set Of keys from HashMap */
		Set setOfKeys = map.keySet();

		/**
		 * get the Iterator instance from Set
		 */
		Iterator iterator = setOfKeys.iterator();

		/**
		 * Loop the iterator until we reach the last element of the HashMap
		 */
		while (iterator.hasNext()) {
			/**
			 * next() method returns the next key from Iterator instance. return
			 * type of next() method is Object so we need to do DownCasting to
			 * String
			 */
			String key = (String) iterator.next();

			/**
			 * once we know the 'key', we can get the value from the HashMap by
			 * calling get() method
			 */
			String value = map.get(key);

			System.out.println("Key: " + key + ", Value: " + value);
		}
	}
}
