package exceptionhandling;

import java.util.Scanner;

public class UsagesOfFinally {

	public static void main(String[] args) {
		case1();
	}
	
	//All 3 cases are handled by giving different inputs
	public static void case1()
	{
		try 
		{
			int a=34;
			System.out.println("Enter the divider: ");
			Scanner scanner= new Scanner(System.in);
			int b=scanner.nextInt();
			int c= a/b;
			System.out.println("A divided by B: " + c);
			scanner.close();
		}
		catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		finally {
			System.out.println("Finally phir b chalega !");
		}
		
	}

}
