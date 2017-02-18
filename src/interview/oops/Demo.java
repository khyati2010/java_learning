package interview.oops;

import java.util.Arrays;
import java.util.HashSet;

public class Demo {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 5, 7, 6 };
		Arrays.sort(a1);
		HashSet hs = new HashSet();
		int j = 0;
		for (int i = 1; i < 10; i++) {
			if (j < a1.length && i == a1[j]) {
				j++;
			} else {
				hs.add(i);
			}
		}
		System.out.println(hs);
	}

	// will be the sum of the numbers in the array.
	int sum = 0;
	int idx = -1;
	
	static{
		System.out.println("test");
	}

	public void missing() {
		String withString ="";
	    long t0 = System.currentTimeMillis();
	    for (int i = 0 ; i < 100000; i++){
	        withString+="some string";
	    }
	    System.out.println("strings:" + (System.currentTimeMillis() - t0));

	    t0 = System.currentTimeMillis();
	    StringBuffer buf = new StringBuffer();
	    for (int i = 0 ; i < 100000; i++){
	        buf.append("some string");
	    }
	    System.out.println("Buffers : "+(System.currentTimeMillis() - t0));

	    t0 = System.currentTimeMillis();
	    StringBuilder building = new StringBuilder();
	    for (int i = 0 ; i < 100000; i++){
	        building.append("some string");
	    }
	    System.out.println("Builder : "+(System.currentTimeMillis() - t0));
	}
		
	}
	
	
}