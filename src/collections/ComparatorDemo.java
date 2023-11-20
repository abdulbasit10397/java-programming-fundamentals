package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee
{
	public String name;
	public int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

class AgeCompare implements Comparator<Employee>
{

	@Override
	public int compare(Employee obj1, Employee obj2) {
		
		Employee emp1= (Employee)obj1;
		Employee emp2= (Employee)obj2;
		
		if(emp1.age==emp2.age)
		{
			return 0;
		}
		else if(emp1.age>emp2.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}

class NameCompare implements Comparator<Employee>
{

	@Override
	public int compare(Employee obj1, Employee obj2) {
		
		Employee emp3= (Employee)obj1;
		Employee emp4= (Employee)obj2;
		
		return (emp3.name.compareTo(emp4.name));
		
	}
}
public class ComparatorDemo {

	public static void main(String[] args) {
		Employee s1= new Employee("Tom", 25);
		Employee s2= new Employee("Sam", 24);
		Employee s3= new Employee("Bob", 22);
		Employee s4= new Employee("Wags", 23);
		Employee s5= new Employee("Martin", 21);
		
		ArrayList<Employee> employees= new ArrayList<>();
		employees.add(s1);
		employees.add(s2);
		employees.add(s3);
		employees.add(s4);
		employees.add(s5);
		
		System.out.println("*****Employees Before Sorting *****\n");
		Iterator<Employee> iterator= employees.iterator();
		while(iterator.hasNext())
		{
			Employee employee;
			employee=iterator.next();
			System.out.println(employee.name);
			System.out.println(employee.age);
			System.out.println();
			
		}
		System.out.println();
		
		//JVM automatically calls CompareTo and compares and sorts on the
		//basis of age.
		
		//Below statement compares names
		Collections.sort(employees, new NameCompare());
		
		//Below statement compares age
		//Collections.sort(employees, new AgeCompare());
		
		System.out.println("*****Employees After Sorting *****\n");
		Iterator<Employee> iterator1= employees.iterator();
		while(iterator1.hasNext())
		{
			Employee employee;
			employee=iterator1.next();
			System.out.println(employee.name);
			System.out.println(employee.age);
			System.out.println();
		}
		System.out.println();

	}

}
