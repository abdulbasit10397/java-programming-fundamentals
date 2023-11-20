package methodoverriding;

class A2
{
	Object getReturnType()
	{
		return this;
	}
}

class B2 extends A2
{
	//It works because the String is the subclass of object class
	//Covariant only works on non-primitive types which exists in the sub class
	String getReturnType()
	{
		return "String return type.";
	}
}

public class CovariantExample2 {

	public static void main(String[] args) {
		B2 b2= new B2();
		System.out.println(b2.getReturnType());
	}

}
