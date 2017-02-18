package prog.string;

import java.util.*;

public class nonrepeatingcharcter {
	/* First create the  character count hash table .
	  
     For each character
       If there is no value stored in the character 
                set it to 1 .
       else 
                increment the value of the character by 1 .

2.  Scan the string
      For each character
      return character if the count in hash table is 1 .
      If no character have count 1 , return null */
    		  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some string");
		// String s = sc.nextLine();
		System.out.println(caluclateparantheses(sc.nextLine()));
	}

	public static String caluclateparantheses(String s) {

		if (s.length() == 0)
			return "empty string";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			String Current = s.charAt(i) + "";
			if (map.containsKey(Current)) {
				System.out.println(Current);
				return Current;

			} else {
				map.put(Current, 1);
			}
		}
		return "no character is repeating";

	}

}