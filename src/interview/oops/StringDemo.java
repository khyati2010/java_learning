package interview.oops;

public class StringDemo {
	 
	public static void main (String args[]) {
	 
	        String str="Java";
	        StringBuffer sb= new StringBuffer("Java");
	        StringBuilder sbr= new StringBuilder("Java");
	 
	       System.out.println(str.concat(" language"));    
	       System.out.println(sb.append(" language"));
	        System.out.println(sbr.append(" language"));
	}
	
}
