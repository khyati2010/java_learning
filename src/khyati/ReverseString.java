package khyati;

import java.util.Scanner;

public class ReverseString {
	static String st = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter ");
		st = sc.nextLine();
		char[] ch = st.toCharArray();
		for (int i = st.length() - 1; i >= 0; i--) {
			System.out.println(st.charAt(i));
		}

	}
}
