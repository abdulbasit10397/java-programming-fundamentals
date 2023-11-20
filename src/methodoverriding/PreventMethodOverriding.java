package methodoverriding;

class A3
{
	//final keyword will prevent it from getting overridden
	//private methods can also be not overridden because they are inaccessible 
	Object getReturnType()
	{
		System.out.println("Inside A3");
		return this;
	}
}

class B3 extends A3
{
	String getReturnType()
	{
		//calls the method of parent class i.e A3
		super.getReturnType();
		
		System.out.println("Inside B3");
		return "";
	}
}


public class PreventMethodOverriding {

	public static void main(String[] args) {
		B3 b3= new B3();
		System.out.println(b3.getReturnType());

	}

}
