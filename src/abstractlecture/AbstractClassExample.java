package abstractlecture;

abstract class Vehicle
{
	abstract int getNoOfWheels();
}

class Bike extends Vehicle
{
	int getNoOfWheels()
	{
		return 2;
	}
}
class Car extends Vehicle
{
	int getNoOfWheels()
	{
		return 4;
	}
}

public class AbstractClassExample {
	public static void main(String[] args) {
		//Through reference of vehicle class
		Vehicle a= new Bike();
		System.out.println(a.getNoOfWheels());
		
		Vehicle b= new Car();
		System.out.println(b.getNoOfWheels());

	}
}
