package exceptionhandling;

import java.io.IOException;

public class ExceptionPropagationOfCheckedException {

	public static void method1() throws IOException
	{
		throw new IOException("Device not ready!");
	}
	
	public static void method2() throws IOException
	{
		method1();
	}
	
	public static void method3()
	{
		try 
		{
			method2();	
		} 
		catch (IOException e) 
		{
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		method3();

	}
}
