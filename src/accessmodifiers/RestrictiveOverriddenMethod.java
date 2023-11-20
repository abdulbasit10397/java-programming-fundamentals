package accessmodifiers;

class Aa
{
	public int myKey=10;
	public void print()
	{
		System.out.println("I am printing from parent class... !");
	}
	
}

class B extends Aa
{
	// The below statement gives an error because i am
	//giving it a restrictive/weaker access privilege 
	//compared to access privilege of method in parent class
//	protected void print()
//	{
//		System.out.println("I am printing from child class... !");
//	}
	
	public void print()
	{
		System.out.println("I am printing from child class ... !");
	}
}

public class RestrictiveOverriddenMethod {

	public static void main(String[] args) {
		Aa a= new B();
		a.print();

	}

}
