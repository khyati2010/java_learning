package pratise;

public class Buffer_reader {
/*	It is recommended to use StringBuilder whenever possible because it is faster than StringBuffer. 
	However, if the thread safety is necessary, the best option is StringBuffer objects.*/
	public void strRead() {

		StringBuffer sBuffer = new StringBuffer("test");
		sBuffer.append(" String Buffer");
		System.out.println(sBuffer);
		
		
		String palindrome = "Dot saw I was Tod";
	      int len = palindrome.length();
	      System.out.println( "String Length is : " + len );
	}
}
