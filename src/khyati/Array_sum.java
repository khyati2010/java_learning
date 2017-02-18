package khyati;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_sum {
	int sum = 0;

	public static void main(String[] args) {

	}

	public void arraySum() {
		ArrayList<Integer> A = new ArrayList<Integer>();

		Scanner S = new Scanner(System.in);

		System.out.println("Enter the Numbers: ");

		for (int i = 0; i < 5; i++) {

			A.add(S.nextInt());
		}

		System.out.println("You have entered: " + A);

		int Sum = 0;

		for (int i = 0; i < A.size(); i++) {

			Sum = Sum + A.get(i);

		}

		System.out.println("The Sum of Entered List is: " + Sum);

	}
}
