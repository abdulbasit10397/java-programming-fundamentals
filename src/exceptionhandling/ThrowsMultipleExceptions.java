package exceptionhandling;
import java.io.IOException;

//Example of declaring multiple exceptions using throws
public class ThrowsMultipleExceptions {

	public static void tryMe(int num) throws IOException, ClassNotFoundException
	{
		if(num==1)
		{
			throw new IOException("IOException Occured");
		}
		else 
		{
			throw new ClassNotFoundException("Class Not Found Exception");
		}
	}
	
	public static void main(String[] args) {
		try 
		{
			tryMe(1);
		} catch (Exception e) 
		{
			System.out.println("Exception: " + e);
		}

	}

}
