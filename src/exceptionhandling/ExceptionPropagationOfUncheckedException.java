package exceptionhandling;

public class ExceptionPropagationOfUncheckedException {

	public void doStuff()
	{
		int a,b;
		a=10;
		b=0;
		int c=a/b;
		
	}
	public void doMoreStuff()
	{
		doStuff();
	}
	public void doExtraMoreStuff()
	{
		try 
		{
			doMoreStuff();	
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		ExceptionPropagationOfUncheckedException ex= new ExceptionPropagationOfUncheckedException();
		ex.doExtraMoreStuff();

	}

}
