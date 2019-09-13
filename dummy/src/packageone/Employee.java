package packageone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Employee {
	
	static ArrayList<Employee> empArr = new ArrayList<Employee> ();
	
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

	    public Employee(int id, String name, int age, int salary) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }
	    public String toString() {
	        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
	                this.salary + "]";
	    }
	    public static void main(String[] args) {
	    	Predicate<Integer> p=i->i>10;
	    	
	    	empArr.add(new Employee(10, "Mikey", 25, 10000));
	    	empArr.add(new Employee(20, "Arun", 29, 20000));
	    	empArr.add(new Employee(5, "Lisa", 35, 5000));
	    	empArr.add(new Employee(1, "Pankaj", 32, 50000));
		Collections.sort(empArr,(e1,e2)->(e1.id>e2.id)?1:(e1.id<e2.id)?-1:0);//ascendingOrder
		empArr.forEach((Employee emp)->System.out.println(emp.getId()));
		
		//System.out.println(empArr);
		}
}

