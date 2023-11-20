package exceptionhandling;

import java.io.IOException;

public class ThrowsExample {

	public static void method1() throws IOException
	{
		throw new IOException("Device not ready!");
	}
	public static void main(String[] args) {
		
		//Necessary to handle exception because of throws keyword
		// in declaration of method1()
		try {
			method1();
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
