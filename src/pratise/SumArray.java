package pratise;

import java.util.Scanner;

public class SumArray {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter elements : ");
		int i = 0;
		int[] array = new int[10];
		for (i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			for (int j : array) {
				sum = sum + j;
			}
		}
		System.out.println(sum);
	}

}
