package pratise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sort {

	public static void sort() {

		String[] s = new String[] { "A", "B", "c" };
		Arrays.sort(s);
		for (String string : s) {
			System.out.println(string);
		}
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("A");
		arr.add("C");
		arr.add("B");
		Collections.sort(arr);
		for (String string : arr) {
			
			System.out.println(string);
		}
	}

}
