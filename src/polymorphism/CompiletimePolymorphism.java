package polymorphism;

public class CompiletimePolymorphism {

	static void overload()
	{
		System.out.println("Method with no parameters");
	}
	
	static void overload(int a)
	{
		System.out.println("Method with one parameter");
	}
	
	
	static void overload(int a, int b)
	{
		System.out.println("Method with two parameters");
	}
	
	static void overload(double a)
	{
		System.out.println("Method with double parameter");
	}
	
	public static void main(String[] args) {
		overload();
		overload(1);
		overload(1,2);
		overload(10.53);

	}
	
}
