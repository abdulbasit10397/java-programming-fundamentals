package interfaces;

interface DefaultMethodExample
{
	default void show()
	{
		System.out.println("Inside Default Method");
		
	}
	
	void m1();
	
}

public class DefaultMethodsInInterface implements DefaultMethodExample {

	@Override
	public void m1() {
		System.out.println("Inside Method 1");
		
	}
	
	//Overriding default method 
	public void show()
	{
		System.out.println("Overriding default Method");
	}
	
	public static void main(String[] args) {
		
		DefaultMethodsInInterface dMethodsInInterface= new DefaultMethodsInInterface();
		dMethodsInInterface.show();
		dMethodsInInterface.m1();
	}

}
