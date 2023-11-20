package exceptionhandling;

public class InterruptedExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0; i<=10; i++)
		{
			System.out.println(i);
			
			//Without declaring exception through throws in method declaration
			//The below statement gives a compile time error because
			//it's a checked exception.
			//The below statement makes the thread sleep for 1000 milli seconds
			Thread.sleep(1000);
		}

	}

}
