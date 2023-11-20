package finalkeywordlecture;

class A 
{
	final void methodOfA() {
		System.out.println("Final Method in Class A");
	}
}
class B extends A 
{
//	The following code will give an error because we can't override a final method
//	void methodOfA()
//	{
//		System.out.println("Overriding methodOfA in class B");
//	}
	
}
public class FinalMethod {

	public static void main(String[] args) {
		B b= new B();
		//no restriction on calling methodOfA through subclass object
		b.methodOfA();
		
	}

}
