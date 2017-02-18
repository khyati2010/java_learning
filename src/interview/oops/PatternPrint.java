package interview.oops;

import java.util.ArrayList;

public class PatternPrint {

	/*
	 * Print below pattern: This program is one of the best to understand the
	 * for… loop 1 12 123 1234 12345
	 */

	public static void main(String args[]) {
		PatternPrint print = new PatternPrint();
		print.pattern();
	}

	public void patternPrint() {
		for (int i = 1; i < 6; i++) {

			for (int j = 1; j < i; j++) {

				System.out.print(j);
			}
			System.out.println(i);
		}
	}

	/*
	 * Print
	 * 
	 * *********************
	 */
	public void pattern() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					
				} else
					
					System.out.print("*");
			}System.out.print("\n");
		}
	}
	
}
