package interitence;

class Animal{
	void eat()
	{
		System.out.println("Animals are eating");
	}
	void sleep()
	{
		System.out.println("Animals are sleeping");
	}
}

class Dog extends Animal{
	void bark()
	{
		System.out.println("Barking ... Bahu bahu bahu");
	}
}

public class SingleInheritence {

	public static void main(String[] args) {
		Dog tony = new Dog();
		tony.bark();
		tony.eat();
		tony.sleep();
		
	}

}
