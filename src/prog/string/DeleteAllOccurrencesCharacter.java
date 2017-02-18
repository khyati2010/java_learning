package prog.string;

import static java.lang.System.*;

/*
 * This basic java example source code
 * shows how to delete all occurrences of a character on a String
 */

public class DeleteAllOccurrencesCharacter {

	public static void main(String[] args) {
		// Declare a string object
		String strValue = "aaxabbccddeefff";
		// call a method to delete all occurrences
		String newString = deleteAll(strValue, "a");
		// print the new string value
		out.println("New String:" + newString);

	}

	private static String deleteAll(String strValue, String charToRemove) {
		return strValue.replaceAll(charToRemove, "");

	}

	/*
	 * Logic : We need to remove the certain characters from the original string
	 * . To achieve this , we will create a tempBoolean array , in which every
	 * index element value will be false by default . As we know if we put char
	 * in integer field , it will always print the ascii value of the character
	 * . We will pass one by one the characters of the removecharacterstring to
	 * the index of the tempBoolean array , and set the corresponding index
	 * value to true . Now iterate through the originalstring and print the
	 * character only if its value in tempBoolean is false.
	 * 
	 * 
	 * 
	 * Pseudo Algorithm :
	 * 
	 * Change strings originalstring and removecharacterstring to character
	 * array .
	 * 
	 * Create a temporary boolean array named tempBoolean of length 128 (ASCII
	 * characters) . This will set all the indexes value to false by default .
	 * 
	 * Iterate through each character in removecharacterstring , setting the
	 * corresponding values in the tempBoolean array to true .
	 * 
	 * Start iterating originalstring from 0 to the length of the originalstring
	 * string , copying each character only if its corresponding value in
	 * tempBoolean array is false .
	 */

}