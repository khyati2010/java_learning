package prog.string;

public class RemoveCharFromString {

	static String input = "";

	public static void main(String[] args) {
		input = "abadbbeb34erterb";
		char token = 'b';
		removeChar(token);
	}

	private static void removeChar(char token) {
		// TODO Auto-generated method stub
		System.out.println(input);
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == token) {
				input = input.replace(input.charAt(i), ' ');
				System.out.println("MATCH FOUND");
			}
			input = input.replaceAll(" ", "");
			System.out.println(input);
		}
	}
}