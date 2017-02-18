package questions;
public class Main { 
	public static void main(String[] args)
	{ 
		// An example of static and dynamic binding in Java
		Insurance current = new CarInsurance(); 
		// dynamic binding based upon object 
		int premium = current.premium(); 
		// static binding based upon class 
		String category = current.category(); 
		System.out.println("premium : " + premium); 
		System.out.println("category : " + category);
		} 
	}
 

//Read more:http://www.java67.com/2016/08/difference-between-early-vs-late-binding-in-java.html#ixzz4YYjNuBWy