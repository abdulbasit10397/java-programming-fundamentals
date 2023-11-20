package accessmodifiers;

class ProtectedClass
{
	protected int balance=100000;
	protected void myBalance()
	{
		System.out.println("My Balance: " + balance);
	}
	
}
public class ProtectedAccessModifier extends ProtectedClass{

	public static void main(String[] args) {
		
		ProtectedClass protectedClass= new ProtectedClass();
		//protected method "myBalance()" of "ProtectedClass" is accessible 
		//because it is extended by this class
		protectedClass.myBalance();

	}

}
