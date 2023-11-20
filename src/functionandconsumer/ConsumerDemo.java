package functionandconsumer;

import java.util.function.Consumer;

class Student 
{
	String name;
	double marks;
	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
}

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Student student= new Student("Abu Bakar", 5);
		
		Consumer<Student> cs=s-> {
			System.out.println("Name: " + s.name);
			System.out.println("Marks: " + s.marks);
		};
		
		cs.accept(student);

	}

}
