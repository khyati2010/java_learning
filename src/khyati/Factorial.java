package khyati;

import java.util.Scanner;

public class Factorial {

	int num = 0;
	int fact = 1;

	public void fact(int n) {

		if (n == 0 || n == 1) {
			System.out.println("fact is 1");
		}
		for (int i = n; i > 0; i--) {
			fact = fact *i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		Factorial fc = new Factorial();
		fc.fact(sc.nextInt());
	}
}
