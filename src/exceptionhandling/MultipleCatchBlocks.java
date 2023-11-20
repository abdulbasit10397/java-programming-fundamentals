package exceptionhandling;

import java.io.IOException;
import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		multipleCatchBlocks();
	}
	
	public static void multipleCatchBlocks()
	{
		System.out.println("Starting");
		try 
		{
			int a, b;
			System.out.println("Enter two numbers: ");
			Scanner scanner= new Scanner(System.in);
			a=scanner.nextInt();
			b=scanner.nextInt();
			System.out.println("Division: " + (a/b));
			
			int[] array= new int [5];
			array[10]=50;
			System.out.println("Array: " + array[10]);
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Exception: " + e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e);
		}
		
		System.out.println("The end");
	}

}
