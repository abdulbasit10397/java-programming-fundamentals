package interitence;

class Animalll{
	void eat()
	{
		System.out.println("Animals are eating");
	}
	void sleep()
	{
		System.out.println("Animals are sleeping");
	}
}

class Doggg extends Animalll{
		void bark()
		{
			System.out.println("Barking ... Bahu bahu bahu");
		}
}
class Cat extends Animalll{
	void meow()
	{
		System.out.println("Meow Meow Meow");
	}
}

public class HierarchicalInheritence {
	

	public static void main(String[] args) {
		Doggg tony = new Doggg();
		tony.bark();
		tony.eat();
		tony.sleep();
		
		System.out.println();
		
		Cat billi = new Cat();
		billi.meow();
		billi.eat();
		billi.sleep();
		

	}

}
