package exceptionhandling;

public class UncheckedException {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		//The below statement will give Arithmetic Exception
		// but it's not checked at compile time so
		//This is called an unchecked exception
		int c=a/b;
		System.out.println("C: " + c);

	}

}
