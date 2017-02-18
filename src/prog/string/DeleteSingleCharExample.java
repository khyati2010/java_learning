package prog.string;

public class DeleteSingleCharExample {

	public static void main(String[] args) {
		// Declare a string object
		String strValue = "aaxabbccddeefff";
		// call a method to delete a character
		String newString = deleteCharAt(strValue, 2);
		// print the new string value
		System.out.println("New String:" + newString);

	}

	private static String deleteCharAt(String strValue, int index) {
		return strValue.substring(0, index) + strValue.substring(index + 1);

	}

}