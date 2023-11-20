package exceptionhandling;

class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String message) {
		super(message);
	}
}

public class CustomizedExceptions {

	public static void withdrawFunds(int amount) throws InsufficientFundsException
	{
		int accountBalance=10000;
		if(accountBalance<amount)
		{
			throw new InsufficientFundsException("Sorry, You don't have sufficient funds... !");
		}
		else 
		{
			accountBalance=accountBalance-amount;
			System.out.println("Transaction Successful.");
			System.out.println("Balance Amount: " + accountBalance);
		}
		
	}
	
	public static void main(String[] args) {
		try 
		{
			withdrawFunds(19000);
		} 
		catch (InsufficientFundsException e) {
			System.out.println(e);
		}

	}

}
