package interview.oops;

import java.io.IOException;
import java.util.Scanner;

public class StringCounter {
public static void main(String[] args) throws IOException {
	StringCounter sc = new StringCounter();
	Scanner sc1 = new Scanner(System.in);
	sc.count(sc1.next());
}
	public static int count(String sentence) throws IOException {

		int count = 0; String s;
		if (sentence == null || sentence.isEmpty()) {
			System.out.println(" String is empty");
			s.	
			return 0;
		} else {
			String[] str = sentence.split("\\s+");
			System.out.println(str.length);
			return str.length;
		
		}
	}
}