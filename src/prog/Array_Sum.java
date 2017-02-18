package prog;

import java.util.Scanner;

class Array_Sum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		System.out.println("Enter the elements:");
		for (int i = 0; i < 10; i++) {
			array[i] = scanner.nextInt();
		}
		for (int num : array) {
			sum = sum + num;
		}
		System.out.println("Sum of array elements is:" + sum);
	}

	public void arrTest() {

		// Declaration of integer type array and initialize with 10 values
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int ans = 0;
		for (int i = 0; i < 10; i++)
			ans += array[i];
		System.out.println("Sum of Array: " + ans);
	}
}
