package khyati;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountCharString {

	private void count() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some thing");
		String st = sc.next();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = st.toCharArray();
		for (Character c : ch) {
			if (map.containsKey(ch)) {
				map.put(c, map.get(ch) + 1);

			} else
				map.put(c, 1);

		}

		// Iterate through HashMap to print all duplicate characters of String
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n",
				st);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(),
						entry.getValue());
			}
		}
	}

	

	public static void main(String[] args) {
		CountCharString test = new CountCharString();
		test.count();
	}
	
	
}
