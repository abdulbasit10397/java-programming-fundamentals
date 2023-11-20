package interitence;

class Animals{
	void eat()
	{
		System.out.println("Animals are eating");
	}
	void sleep()
	{
		System.out.println("Animals are sleeping");
	}
}

class Dogs extends Animals{
	void bark()
	{
		System.out.println("Barking ... Bahu bahu bahu");
	}
}
class Labrador extends Dogs {
	void breed()
	{
		System.out.println("The breed is Labrador");
	}
}

public class MultiLevelInheritence {
	
	public static void main(String[] args) {
		Labrador tony = new Labrador();
		tony.breed();
		tony.bark();
		tony.eat();
		tony.sleep();

	}

}
