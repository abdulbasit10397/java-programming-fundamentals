package methodoverloading;

class Box
{
	double length, width, height;
	
	//Three different constructors with different parameters
	Box()
	{
		length=5;
		width=5;
		height=10;
	}
	
	Box(double len)
	{
		length=width=height=len;
	}
	
	Box(double length, double width, double height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
	
	void dislplayBox()
	{
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Box box1= new Box();
		System.out.println("******** Box 1 ********");
		box1.dislplayBox();
		
		box1= new Box(5.55);
		System.out.println("******** Box 2 ********");
		box1.dislplayBox();
		
		box1= new Box(5.55, 5.55, 10.9);
		System.out.println("******** Box 3 ********");
		box1.dislplayBox();

	}

}
