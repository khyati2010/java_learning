package pratise;

import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int age;
	private long salary;

	public static void main(String[] args) {
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);

		// sorting employees array using Comparable interface implementation
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"
				+ Arrays.toString(empArr));
		
		//sort employees array using Comparator by Salary
		Arrays.sort(empArr, Employee.SalaryComparator);
		System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));

		//sort employees array using Comparator by Age
		Arrays.sort(empArr, Employee.AgeComparator);
		System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));

		//sort employees array using Comparator by Name
		Arrays.sort(empArr, Employee.NameComparator);
		System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, int age, int salary) {
		this.salary = salary;
		this.name = name;
		this.age = age;
		this.id = id;

	}

	// this is overriden to print the user friendly information about the
	// Employee

	@Override
	public String toString() {

		return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age
				+ ", salary=" + this.salary + "]";
	}
	// sorting object array

	 public int compareTo(Employee emp) {
	        //let's sort the employee based on id in ascending order
	        //returns a negative integer, zero, or a positive integer as this employee id
	        //is less than, equal to, or greater than the specified object.
	        return (this.id - emp.id);
	    }
	
	 /**
	     * Comparator to sort employees list or array in order of Salary
	     */
	    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

	        public int compare(Employee e1, Employee e2) {
	            return (int) (e1.getSalary() - e2.getSalary());
	        }
	    };
		
		 /**
		     * Comparator to sort employees list or array in order of name
		     */
	    
	    public static Comparator<Employee> NameComparator  = new Comparator<Employee>(){
	    	public int compare(Employee e1, Employee e2){
	    		return e1.getName().compareTo(e2.getName());
	    	}
	    };

		 /**
		     * Comparator to sort employees list or array in order of id
		     */
	    public static Comparator<Employee> AgeComparator  = new Comparator<Employee>(){
	    	public int compare(Employee e1, Employee e2){
	    		return e1.getAge() - e2.getAge();
	    	}
	    };
	    
	    
}
