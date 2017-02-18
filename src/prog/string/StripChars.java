package prog.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StripChars {
	public static void main(String[] args) {
		// prints: Just to clarify I will have strings of varying lengths
		System.out.println(replace(
				"Just to clarify, I will have strings of varying lengths.",
				",."));

		// prints: Solution to my problem on Stackoverflow will cost me 0
		System.out.println(replace(
				"Solution to my problem on stackoverflow will cost me $0.",
				".$"));
	}

	static String replace(String line, String charsToBeReplaced) {
		Pattern p = Pattern.compile("(.{1})");
		Matcher m = p.matcher(charsToBeReplaced);
		return line.replaceAll(m.replaceAll("\\\\$1\\|"), "");
	}
}