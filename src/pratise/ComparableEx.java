package pratise;

import java.util.Arrays;
import java.util.*;

public class ComparableEx {

	public static void main(String[] args) {
		// sort primitives array like int array
		int[] arr = { 11, 3, 4, 5 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// sorting String array
		String[] arr1 = { "a", "d", "a" };
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));

		// sorting list of objects of Wrapper classes
		List<String> li = new ArrayList<String>();
		li.add("a");
		li.add("b");
		li.add("ca");
		li.add("dq");
		Collections.sort(li);
		for (String string : li) {
			System.out.println(string);
		}

	}

}
