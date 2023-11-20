package interfaces;
//Multiple Inheritance using interfaces

interface One
{
	void show();
}

interface Two
{
	void show();
}
public class MultipleInheritance implements One, Two {
	
	
	//show() is overridden once because implementation class i.e. MultipleInheritance is different
	//So, there is no ambiguity for compiler
	@Override
	public void show() {
		System.out.println("Inside show method");
		
	}
	
	public static void main(String[] args) {
		MultipleInheritance mInheritance= new MultipleInheritance();
		mInheritance.show();


	}

}
