package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class AStudent implements Comparable<AStudent>
{
	public String name;
	public int age;

	public AStudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(AStudent student) {

		if(this.age==student.age)
		{
			return 0;
		}
		else if(this.age>student.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}


}


public class ComparableDemo {

	public static void main(String[] args) {
		AStudent s1= new AStudent("Abdul Basit", 25);
		AStudent s2= new AStudent("Adeel", 24);
		AStudent s3= new AStudent("Hamza", 28);
		AStudent s4= new AStudent("Ahmed", 23);
		AStudent s5= new AStudent("Ali", 21);
		
		ArrayList<AStudent> students= new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		System.out.println("*****Students Before Sorting *****\n");
		Iterator<AStudent> iterator= students.iterator();
		while(iterator.hasNext())
		{
			AStudent student;
			student=iterator.next();
			System.out.println(student.name);
			System.out.println(student.age);
			System.out.println();
		}
		System.out.println();
		
		//JVM automatically calls CompareTo and compares and sorts on the
		//basis of age.
		Collections.sort(students);
		System.out.println("*****Students After Sorting *****\n");
		Iterator<AStudent> iterator1= students.iterator();
		while(iterator1.hasNext())
		{
			AStudent student;
			student=iterator1.next();
			System.out.println(student.name);
			System.out.println(student.age);
			System.out.println();
		}
		System.out.println();


	}

}
