package exceptionhandling;

public class ExceptionTypes {

	public static void main(String[] args) {
		//arithmeticException();
		//indexOutOfBoundException();
		nullPointerException();
	}
	
	public static void arithmeticException()
	{
		System.out.println("Starting");
		try 
		{
			int a=0;
			int b=50;
			int c=b/a;
			System.out.println("C: " + c);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception: " + e);
		}
		
		System.out.println("The end");
	}
	public static void indexOutOfBoundException()
	{
		
		
		System.out.println("Starting");
		try 
		{
			int[] arr= {1,2,3,4,5};
			arr[6]=10;
			System.out.println("Array element: " + arr[6]);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception: " + e);
		}
		
		System.out.println("The end");
	}
	
	public static void nullPointerException()
	{	
		System.out.println("Starting");
		try 
		{
			String string=null;
			System.out.println("String value: " + string.length());
		}
		catch (NullPointerException e) {
			System.out.println("Exception: " + e);
		}
		
		System.out.println("The end");
	}

}
