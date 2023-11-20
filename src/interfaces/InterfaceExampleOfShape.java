package interfaces;

interface Shape
{
	void draw();
}

class Rectangle implements Shape
{

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
		
	}
	
	public int noOfSides()
	{
		return 4;
	}
}

class Triangle implements Shape
{

	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
		
	}
	public int noOfSides()
	{
		return 3;
	}
	
}

public class InterfaceExampleOfShape {

	public static void main(String[] args) {
	
		Rectangle rectangle= new Rectangle();
		rectangle.draw();
		System.out.println(rectangle.noOfSides());
		

		Shape triangle= new Triangle();
		triangle.draw();

		/* Can't access noOfSides through a reference of shape.
		  We have to create a reference of triangle to access all the methods of Triangle class */
		//System.out.println(triangle.noOfSides());
		
		

	}

}
