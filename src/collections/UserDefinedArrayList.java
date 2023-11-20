package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

class Student
{
	int rollNo;
	String name;
	int age;
	static final String schoolName="The Educators";
	
}

public class UserDefinedArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> students= new ArrayList<Student>();
		
		Student student= new Student();
		student.rollNo=0001;
		student.name="Abu Bakar";
		student.age=12;
		students.add(student);		
		
		//Traversing through Iterator
		Iterator<Student> iterator= students.iterator();
		while(iterator.hasNext())
		{
			//(Student) in below statement is for casting object into student
			//But the program works fine without it
			Student s=(Student)iterator.next();
			System.out.println(s.rollNo);
			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(Student.schoolName);
			System.out.println();
			
		}
		
		//Traversing through For Each Loop
		for(Student s: students)
		{
			System.out.println(s.rollNo);
			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(Student.schoolName);
			System.out.println();
		}
		
		//Traversing through normal For Loop
		for(int i=0; i<students.size(); i++)
		{
			System.out.println(students.get(i).rollNo);
			System.out.println(students.get(i).name);
			System.out.println(students.get(i).age);
			System.out.println(Student.schoolName);
			System.out.println();
		}
		
		//Traversing through Enumerator (Obsolete)
		Enumeration<Student> e = Collections.enumeration(students);

		//enumerate through the ArrayList elements
		System.out.println("Enumerating through Java ArrayList");
		while(e.hasMoreElements())
		{
			Student s1=e.nextElement();
			System.out.println(s1.rollNo);
			System.out.println(s1.name);
			System.out.println(s1.age);
			System.out.println(Student.schoolName);
			System.out.println();
		}
	}

}
