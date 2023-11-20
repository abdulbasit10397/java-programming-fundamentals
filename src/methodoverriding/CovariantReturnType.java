package methodoverriding;

class A1
{
	A1 getReturnType()
	{
		return this;
	}
}

class B1 extends A1
{
	B1 getReturnType()
	{
		return this;
	}
}
public class CovariantReturnType {

	public static void main(String[] args) {
	
		B1 b1= new B1();
		System.out.println(b1.getReturnType());

	}

}
