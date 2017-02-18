package pratise;

import java.util.*;

class StringPalindrome {
	public static void main(String args[]) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to check if it is a palindrome");
		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse))
			System.out.println("Entered string is a palindrome.");
		else
			System.out.println("Entered string is not a palindrome.");

	}
	
	public static void pallindrome(){

		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter a string");
		 String str=in.nextLine();
		 
		 StringBuffer strone=new StringBuffer(str);
		 StringBuffer strtwo=new StringBuffer(strone);
		 
		  strone.reverse();
		 
		  System.out.println("Orginal String ="+strtwo);
		  System.out.println("After Reverse ="+strone);
		 
		 if(String.valueOf(strone).compareTo(String.valueOf(strtwo))==0)
		   System.out.println("Result:Palindrome");
		    else
		    System.out.println("Result:Not Palindrome");
	}
}