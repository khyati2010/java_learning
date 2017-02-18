package glassdoor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {

	public static void main(String[] args) {
		System.out.println("String is = "
				+ getOnlyStrings("!&(*^*(^(+one(&(^()(*)(*&^%$#@!#$%^&*()("));
		System.out.println("Number is = "
				+ getOnlyDigits("&(*^*(^(+91-&*9hi-639-0097(&(^("));
	}

	public static String getOnlyDigits(String s) {
		Pattern pattern = Pattern.compile("[^0-9]");
		Matcher matcher = pattern.matcher(s);
		String number = matcher.replaceAll("");
		return number;
	}

	public static String getOnlyStrings(String s) {
		Pattern pattern = Pattern.compile("[^a-z A-Z]");
		Matcher matcher = pattern.matcher(s);
		String number = matcher.replaceAll("");
		return number;
	}

	/*
	 * Try using the overload that takes CharSequence arguments (eg, String)
	 * rather than char:
	 * 
	 * str = str.replace("X", "");
	 */

	public static String stripChars(String input, String strip) {
		StringBuilder result = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (strip.indexOf(c) == -1) {
				result.append(c);
			}
		}
		return result.toString();
	}
}