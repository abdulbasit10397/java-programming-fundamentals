package polymorphism;
class Shape
{
	void draw()
	{
		System.out.println("Drawing a shape");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing a rectangle");
	}
	
}

class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing a triangle");
	}
	
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		Shape s;
		s=new Shape();
		s.draw();
		
		//Using reference of superclass to call the overridden method
		//through the object of subclass
		s=new Rectangle();
		s.draw();
		
		s=new Triangle();
		s.draw();

	}

}
