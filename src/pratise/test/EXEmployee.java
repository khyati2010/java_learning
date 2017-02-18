package pratise.test;

import java.util.Arrays;

public class EXEmployee {

	private int id;
	private String name;
	private int age;
	private long salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	public EXEmployee(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		// sorting object array
		EXEmployee[] empArr = new EXEmployee[4];
		empArr[0] = new EXEmployee(10, "Mikey", 25, 10000);
		empArr[1] = new EXEmployee(20, "Arun", 29, 20000);
		empArr[2] = new EXEmployee(5, "Lisa", 35, 5000);
		empArr[3] = new EXEmployee(1, "Pankaj", 32, 50000);

		// sorting employees array using Comparable interface implementation
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"
				+ Arrays.toString(empArr));
		
		
	}

	@Override
	// this is overriden to print the user friendly information about the
	// Employee
	public String toString() {
		return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age
				+ ", salary=" + this.salary + "]";
	}

}
