package questions;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Output {
	public static void main(String[] args) {
		Collection st = new HashSet();
		print(st);
	}

	public static void print(Collection c) {
		System.out.println("Coll");
	}

	public static void print(Set s) {
		System.out.println("Set");
	}

	public static void print(HashSet hs) {
		System.out.println("HS");
		//Runnable r = new Runnable();
		
	}

}
