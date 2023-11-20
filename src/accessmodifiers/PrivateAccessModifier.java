package accessmodifiers;

class A
{
	private int myKey=10;
	private void print()
	{
		System.out.println("I am printing... !");
	}
	
}

public class PrivateAccessModifier {

	public static void main(String[] args) {
		
		A a= new A();
		
		//Below statements will give an error because the field and Function is private
		// and can't be accessed from outside the class
		// a.myKey=1000;
		// a.print();

	}

}
