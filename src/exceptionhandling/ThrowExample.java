package exceptionhandling;

public class ThrowExample {

	public void eligibility(int age)
	{
		if(age>=18)
		{
			System.out.println("Eligible to Vote... !");
		}
		else 
		{
			//Though it's not an arithmetic exception
			//But we are throwing an ArithmeticException explicitly
			//That's the usage of throw
			throw new ArithmeticException("Sorry not eligible");

		}
	}

	public static void main(String[] args) {
		try
		{
			ThrowExample t= new ThrowExample();
			t.eligibility(15);
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e);
		}


	}

}
