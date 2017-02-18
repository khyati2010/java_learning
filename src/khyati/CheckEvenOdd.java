package khyati;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		CheckEvenOdd check = new CheckEvenOdd();
		check.evenAndOdd(num);
	}

	private void evenAndOdd(int num) {
		// TODO Auto-generated method stub

		if (num % 2 == 0)

			System.out.println("Even");
		else
			System.out.println("Odd");

	}

}
