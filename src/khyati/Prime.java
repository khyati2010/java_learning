package khyati;

import java.util.Scanner;

public class Prime {

	public static void prime() {
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Print a number");
		int num = sc.nextInt();
		if (num == 1 || num == 0) {
			System.out.println(num + "is not prime");
		} else
			for (int i = 2; i < num / 2; i++) {
				temp = num % i;
			}
		if (temp == 0) {
			System.out.println("not prime");
		} else
			System.out.println("prime");

	}

	public static void main(String[] args) {
		Prime pr = new Prime();
		pr.prime();
	}
}
