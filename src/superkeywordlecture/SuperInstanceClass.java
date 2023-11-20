package superkeywordlecture;

class A
{
	int i;
	int j;
}

class B extends A{
	int i=30;
	void display()
	{
		j=40;
		//Initializes instance variable of superclass
		super.i=35;
		System.out.println("Value of i in subclass" + i);
		System.out.println("Value of j in subclass" + j);
		System.out.println("Value of i in parent class" + super.i);
	}
	
}
class Animal{
	String color="Black";
}
class Dog extends Animal
{
	String color="brown";
	void display()
	{
		//invoke/prints instance variable of superclass
		System.out.println("THe color of animal is: " + super.color);
		System.out.println("THe color of dog is: " + color);
	}
}
public class SuperInstanceClass {

	public static void main(String[] args) {
	
		B b= new B();
		b.display();
		System.out.println();
		
		Dog chief= new Dog();
		chief.display();

	}

}
