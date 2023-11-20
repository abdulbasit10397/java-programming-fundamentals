package polymorphism;

class Animal
{
	void makeSound()
	{
		System.out.println("Animals make sound");
	}
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dogs make barking sound");
	}
	
}

//Multi-level runtime polymorphism
class Puppy extends Dog
{
	void makeSound()
	{
		System.out.println("Puppies make cute sound");
	}
	
}

public class RuntimePolymorphismMultilevelInheritence {
	public static void main(String[] args)
	{
		Animal a= new Animal();
		a.makeSound();
		
		a= new Dog();  //upcasting
		a.makeSound();
		
		a= new Puppy();
		a.makeSound();
	}

}
