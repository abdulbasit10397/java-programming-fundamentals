package methodoverloading;

public class MethodOverloading {
	
	public static void area(int side)
	{
		System.out.println("Area of Square: " + (side*side));
	}
	
	//different number of arguments
	public static void area(int length, int width)
	{
		System.out.println("Area of Square: " + (length*width));
	}
	
	//different type of arguments
	public static void area(int length, double width)
	{
		System.out.println("Area of Square: " + (length*width));
	}

	public static void main(String[] args) {
		area(10);
		area(10,5);
		area(10,10.5);

	}

}
