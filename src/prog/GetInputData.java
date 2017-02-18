package prog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class GetInputData {
	public static void main(String args[]) throws IOException {
		int num;
		float fnum;
		String str;
		String str1;

		Scanner in = new Scanner(System.in);

		// Get input String
		System.out.println("Enter a string: ");
		str = in.nextLine();
		System.out.println("Input String is: " + str);

		// Get input Integer
		System.out.println("Enter an integer: ");
		num = in.nextInt();
		System.out.println("Input Integer is: " + num);

		// Get input float number
		System.out.println("Enter a float number: ");
		fnum = in.nextFloat();
		System.out.println("Input Float number is: " + fnum);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string: ");
		str1 = br.readLine();
		System.out.println("Input String is: " + str1);

	}
}
