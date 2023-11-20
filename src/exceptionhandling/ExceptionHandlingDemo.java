package exceptionhandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		System.out.println("Before an exception");
		//The below exception will throw an error but it will not terminate 
		//the program. The statement "After an exception" will be executed
		//and that's why we use exception handling because it stops the 
		//disruption of normal flow of execution
		try {
		int a=34;
		int b=0;
		int c=a/b;
		System.out.println("C: " + c);
		}
		catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	
		System.out.println("After an exception");
		
	}

}
