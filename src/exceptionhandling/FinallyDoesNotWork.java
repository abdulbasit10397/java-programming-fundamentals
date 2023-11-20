package exceptionhandling;

import java.util.Scanner;

public class FinallyDoesNotWork {

	public static void main(String[] args) {
		caseWhereFinallyDoesNotExecute();
	}
	
	public static void caseWhereFinallyDoesNotExecute()
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
			System.exit(0);
		}
		catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		finally {
			System.out.println("Finally idr ni chalega !");
		}
		
	}

}
