package glassdoor;

import java.util.*;

public class Expression {
	Scanner in = new Scanner(System.in);
	Stack<Integer> stack = new Stack<Integer>();

	public boolean check() {
		System.out.println("Please enter your expression.");
		String newExp = in.next();
		String[] exp = new String[newExp];
		for (int i = 0; i < size; i++) {

			char ch = exp.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{')
				stack.push(i);
			else if (ch == ')' || ch == ']' || ch == '}') {
				// nothing to match with
				if (stack.isEmpty()) {
					return false;
				} else if (stack.pop() != ch) {
					return false;
				}

			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isBalanced(String expression) {
		  if ((expression.length() % 2) == 1) return false;
		  else {
		    Stack<Character> s = new Stack<Character>();
		    for (char bracket : expression.toCharArray())
		      switch (bracket) {
		        case '{': s.push('}'); break;
		        case '(': s.push(')'); break;
		        case '[': s.push(']'); break;
		        default :
		          if (s.isEmpty() || bracket != s.peek()) { return false;}
		          s.pop();
		      }
		    return s.isEmpty();
		  }
		}

		public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    String expression = in.nextLine();
		    boolean answer = isBalanced(expression);
		    if (answer) { System.out.println("YES");}
		    else { System.out.println("NO");}

		}
		
		private static Map<Character, Character> parenthesesMapLeft = new HashMap<Character, Character>();
		private static Map<Character, Character> parenthesesMapRight = new HashMap<Character, Character>();

		static {
		    parenthesesMapLeft.put('(', '(');
		    parenthesesMapRight.put(')', '(');
		    parenthesesMapLeft.put('[', '[');
		    parenthesesMapRight.put(']', '[');
		    parenthesesMapLeft.put('{', '{');
		    parenthesesMapRight.put('}', '{');
		}

		/*public static void main(String[] args) {
		    System.out.println("Please enter input");
		    Scanner scanner = new Scanner(System.in);

		    String str = scanner.nextLine();

		    System.out.println(isBalanced(str));
		}
*/
		public static boolean isBalanced1(String str) {

		    boolean result = false;
		    if (str.length() < 2)
		        return false;
		    Stack<Character> stack = new Stack<Character>();
		    for (int i = 0; i < str.length(); i++) {

		        char ch = str.charAt(i);
		        if (!parenthesesMapRight.containsKey(ch) && !parenthesesMapLeft.containsKey(ch)) {
		            continue;
		        }
		        if (parenthesesMapLeft.containsKey(ch)) {
		            stack.push(ch);
		        } else {
		            if (!stack.isEmpty() && stack.pop() == parenthesesMapRight.get(ch).charValue()) {
		                result = true;
		            } else {
		                return false;
		            }
		        }

		    }
		    if (!stack.isEmpty())
		        return result = false;
		    return result;
		}

}